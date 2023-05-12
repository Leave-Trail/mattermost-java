package com.leavetrail.chat.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Table("group_chat_rooms")
public class GroupChatRoom {

    @PrimaryKey
    private UUID id;
    private UUID groupId;
    private String name;
    private Instant createdAt;

    // Getters, setters, and other methods go here
}
