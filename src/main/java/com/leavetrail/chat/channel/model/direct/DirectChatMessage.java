package com.leavetrail.chat.channel.model.direct;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;
import java.time.Instant;
import java.time.LocalDate;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;
import static org.springframework.data.cassandra.core.cql.Ordering.DESCENDING;

@Table("direct_chat_messages")
public class DirectChatMessage {

    @PrimaryKey
    private DirectChatMessageKey key;

    private UUID userId;
    private String content;
    private Instant timestamp;

    public DirectChatMessage(DirectChatMessageKey key, UUID userId, String content, Instant timestamp) {
        this.key = key;
        this.userId = userId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public DirectChatMessageKey getKey() {
        return key;
    }

    public void setKey(DirectChatMessageKey key) {
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

    @PrimaryKeyClass
    public class DirectChatMessageKey {

        @PrimaryKeyColumn(name = "direct_chat_id", type = PARTITIONED)
        private UUID directChatId;

        @PrimaryKeyColumn(name = "page_timestamp", ordinal = 0, type = PARTITIONED, ordering = DESCENDING)
        private LocalDate pageTimestamp;

        @PrimaryKeyColumn(name = "id", ordinal = 1)
        private UUID id;

        public DirectChatMessageKey(UUID directChatId, LocalDate pageTimestamp, UUID id) {
            this.directChatId = directChatId;
            this.pageTimestamp = pageTimestamp;
            this.id = id;
        }

        public UUID getDirectChatId() {
            return directChatId;
        }

        public void setDirectChatId(UUID directChatId) {
            this.directChatId = directChatId;
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

}
