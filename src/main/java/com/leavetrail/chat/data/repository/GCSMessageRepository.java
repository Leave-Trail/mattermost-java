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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
            
            LocalDate date = LocalDate.ofInstant(message.getTimestamp(), null);
            String objectName = getObjectKey(message.getKey().getChatRoomId(), message.getKey().getId(),date);
            BlobInfo blobInfo = BlobInfo.newBuilder(BlobId.of(bucketName, objectName)).build();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(gson.toJson(message).getBytes(StandardCharsets.UTF_8));
            storage.create(blobInfo, inputStream);

            // Save the partition metadata if it doesn't exist
            if (!chatPartitionMetadataRepository.getPartitions(message.getKey().getChatRoomId()).contains(date)) {
                chatPartitionMetadataRepository.savePartition(message.getKey().getChatRoomId(), date);
            }
        }
    }


public List<Message> getMessages(UUID chatId) {
        List<LocalDate> partitions = chatPartitionMetadataRepository.getPartitions(chatId);
        
        return partitions.stream()
        .flatMap(date -> StreamSupport.stream(
                storage.list(bucketName, Storage.BlobListOption.prefix(chatId.toString() + "/" + date.format(DateTimeFormatter.ISO_DATE)))
                        .iterateAll()
                        .spliterator(), false))
        .map(blob -> {
            byte[] content = blob.getContent(Blob.BlobSourceOption.generationMatch());
            ByteArrayInputStream inputStream = new ByteArrayInputStream(content);
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            return gson.fromJson(reader, Message.class);
        })
        .collect(Collectors.toList());
    }



    private String getObjectKey(UUID chatId, UUID messageId, LocalDate date) {
        return chatId.toString() + "/" + date.format(DateTimeFormatter.ISO_DATE) + "/" + messageId.toString() + ".json";
    }

}
