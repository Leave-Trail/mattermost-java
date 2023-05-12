package com.leavetrail.chat.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Table("user_groups")
@Data
public class UserGroup {

    @PrimaryKey
    private UUID id;
    private String name;
    private Instant createdAt;

    // Getters, setters, and other methods go here
}
