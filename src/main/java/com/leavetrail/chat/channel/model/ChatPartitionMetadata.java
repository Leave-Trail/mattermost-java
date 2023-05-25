package com.leavetrail.chat.channel.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;

import java.util.UUID;
import java.time.LocalDate;

@Table("chat_partition_metadata")
public class ChatPartitionMetadata {

    @PrimaryKeyClass
    public static class ChatPartitionMetadataKey {
        @PrimaryKeyColumn(name = "chat_id", type = PrimaryKeyType.PARTITIONED)
        private UUID chatRoomId;

        @PrimaryKeyColumn(name = "page_timestamp", type = PrimaryKeyType.CLUSTERED)
        private LocalDate pageTimestamp;

        // Getters and setters
    }

    @PrimaryKey
    private ChatPartitionMetadataKey key;
    private boolean hotStorage;
    private boolean coldStorage;

    public ChatPartitionMetadata() {}

    public ChatPartitionMetadata(UUID chatId, LocalDate pageTimestamp, boolean hotStorage, boolean coldStorage) {
        this.key = new ChatPartitionMetadataKey();
        this.key.chatRoomId = chatId;
        this.key.pageTimestamp = pageTimestamp;
        this.hotStorage = hotStorage;
        this.coldStorage = coldStorage;
    }

    public ChatPartitionMetadataKey getKey() {
        return key;
    }

    public void setKey(ChatPartitionMetadataKey key) {
        this.key = key;
    }

    public UUID getChatId() {
        return key.chatRoomId;
    }

    public void setChatId(UUID chatId) {
        this.key.chatRoomId = chatId;
    }

    public LocalDate getPageTimestamp() {
        return key.pageTimestamp;
    }

    public void setPageTimestamp(LocalDate pageTimestamp) {
        this.key.pageTimestamp = pageTimestamp;
    }

    public boolean isHotStorage() {
        return hotStorage;
    }

    public void setHotStorage(boolean hotStorage) {
        this.hotStorage = hotStorage;
    }

    public boolean isColdStorage() {
        return coldStorage;
    }

    public void setColdStorage(boolean coldStorage) {
        this.coldStorage = coldStorage;
    }
}
