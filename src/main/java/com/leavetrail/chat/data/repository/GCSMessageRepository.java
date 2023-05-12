package com.leavetrail.chat.data.repository;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.gson.Gson;
import com.leavetrail.chat.model.Message;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class GCSMessageRepository {

    private final ChatPartitionMetadataRepository chatPartitionMetadataRepository;
    private final Storage storage;
    private final String bucketName;
    private final Gson gson;

    public GCSMessageRepository(@Value("${gcs.bucketName}") String bucketName,ChatPartitionMetadataRepository chatPartitionMetadataRepository) {
        this.storage = StorageOptions.getDefaultInstance().getService();
        this.bucketName = bucketName;
        this.gson = new Gson();
        this.chatPartitionMetadataRepository = chatPartitionMetadataRepository;
    
    }

    public void saveMessages(List<Message> messages) {
        for (Message message : messages) {
            LocalDate date = message.getTimestamp().toLocalDate();
            String objectName = getObjectKey(message.getChatId(), message.getId(),date);
            BlobInfo blobInfo = BlobInfo.newBuilder(BlobId.of(bucketName, objectName)).build();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(gson.toJson(message).getBytes(StandardCharsets.UTF_8));
            storage.create(blobInfo, inputStream);
            
            // Save the partition metadata if it doesn't exist
            if (!chatPartitionMetadataRepository.getPartitions(message.getChatId()).contains(date)) {
                chatPartitionMetadataRepository.savePartition(message.getChatId(), date);
            }
        }
    }


    public List<Message> getMessages(UUID chatId) {
        return storage.list(bucketName).iterateAll().stream()
                .filter(blob -> blob.getName().startsWith(chatId.toString()))
                .map(blob -> {
                    try {
                        return gson.fromJson(new InputStreamReader(blob.getContent(), StandardCharsets.UTF_8), Message.class);
                    } catch (IOException e) {
                        throw new RuntimeException("Failed to read message from GCS.", e);
                    }
                })
                .collect(Collectors.toList());
    }



    private String getObjectKey(UUID chatId, UUID messageId, LocalDate date) {
        return chatId.toString() + "/" + date.format(DateTimeFormatter.ISO_DATE) + "/" + messageId.toString() + ".json";
    }

}
