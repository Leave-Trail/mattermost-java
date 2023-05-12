package com.leavetrail.chat.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

import java.time.Instant;
import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@Table("user_group_members")
@Data
public class UserGroupMember {

    @PrimaryKeyClass
    public static class Key {
        @PrimaryKeyColumn(name = "group_id", type = PARTITIONED)
        private UUID groupId;

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
