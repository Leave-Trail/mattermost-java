package com.leavetrail.chat.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Table("group_chat_room_users")
public class GroupChatRoomUser {

    @PrimaryKeyClass
    public static class Key {
        @PrimaryKeyColumn(name = "chat_room_id", type = PARTITIONED)
        private UUID chatRoomId;

        @PrimaryKeyColumn(name = "user_id")
        private UUID userId;

        // Getters, setters, and other methods go here
    }

    @PrimaryKey
    private Key key;
    private Instant joinedAt;
    private boolean isAdmin;

    // Getters, setters, and other methods go here
}
