package com.leavetrail.chat.model;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("messages")
public class Message {
    @PrimaryKeyClass
    public static class MessageKey {
        @PrimaryKeyColumn(name = "chat_room_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
        private UUID chatRoomId;

        @PrimaryKeyColumn(name = "page_timestamp", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
        private LocalDate pageTimestamp;

        @PrimaryKeyColumn(name = "id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
        private UUID id;

        public MessageKey(UUID chatRoomId, LocalDate pageTimestamp, UUID id) {
            this.chatRoomId = chatRoomId;
            this.pageTimestamp = pageTimestamp;
            this.id = id;
        }
        // Getters and setters

        public UUID getChatRoomId() {
            return chatRoomId;
        }

        public void setChatRoomId(UUID chatRoomId) {
            this.chatRoomId = chatRoomId;
        }

        public LocalDate getPageTimestamp() {
            return pageTimestamp;
        }

        public void setPageTimestamp(LocalDate pageTimestamp) {
            this.pageTimestamp = pageTimestamp;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }
    }

    @PrimaryKey
    private MessageKey key;
    @Column("user_id")
    public UUID userId;
    public String content;
    public Instant timestamp;

    public Message(UUID id, UUID chatRoomId, UUID userId, String content) {
        this.key = new MessageKey(chatRoomId, LocalDate.now(), id);

        this.userId = userId;
        this.content = content;
        this.timestamp = Instant.now();
    }

    public Message() {
    }

    public MessageKey getKey() {
        return key;
    }
    public void setKey(MessageKey key) {
        this.key = key;
    }
    public UUID getUserId() {
        return userId;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Instant getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "Message [key=" + key + ", chatRoomId=" + key.chatRoomId + ", userId=" + userId + ", content=" + content
                + ", timestamp=" + timestamp + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Message other = (Message) obj;

        if (key.chatRoomId == null) {
            if (other.key.chatRoomId != null)
                return false;
        } else if (!key.chatRoomId.equals(other.key.chatRoomId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;
        if (timestamp == null) {
            if (other.timestamp != null)
                return false;
        } else if (!timestamp.equals(other.timestamp))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key.chatRoomId == null) ? 0 : key.chatRoomId.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        return result;
    }

    // Getters, setters, and other methods go here

 

}
