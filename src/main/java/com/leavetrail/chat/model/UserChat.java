package com.leavetrail.chat.model;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_chats")
public class UserChat {

    @PrimaryKeyClass
    public static class Key {
        public Key(UUID randomUUID, UUID user1Id, UUID user2Id) {
            this.userChatId = randomUUID;
            this.userId = user1Id;
            this.participantId = user2Id;
        }

        @PrimaryKeyColumn(name = "user_chat_id", type = PARTITIONED)
        private UUID userChatId;

        @PrimaryKeyColumn(name = "user_id")
        private UUID userId;

        @PrimaryKeyColumn(name = "participant_id")
        private UUID participantId;

        // Getters, setters, and other methods go here
    }

    @PrimaryKey
    private Key key;
    private Instant createdAt;
    public UserChat(Key key, Instant createdAt) {
        this.key = key;
        this.createdAt = createdAt;
    }
    public UserChat() {
    }
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "UserChat [key=" + key + ", createdAt=" + createdAt + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserChat other = (UserChat) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!createdAt.equals(other.createdAt))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        return result;
    }

    // Getters, setters, and other methods go here
}
