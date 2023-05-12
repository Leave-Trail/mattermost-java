package com.leavetrail.chat.model;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Table("users")
@Data
public class User {

    @PrimaryKey
    private UUID id;
    private String username;
    private String email;
    private String passwordHash;
    private String displayName;
    private String avatarUrl;
    private Instant lastSeen;
    private Instant createdAt;

    // Getters, setters, and other methods go here
}
