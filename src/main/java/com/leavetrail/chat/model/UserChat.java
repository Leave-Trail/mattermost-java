package com.leavetrail.chat.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Table("user_chats")
@Data
public class UserChat {

    @PrimaryKeyClass
    public static class Key {
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

    // Getters, setters, and other methods go here
}
