package com.leavetrail.chat.channel.model.direct;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.util.UUID;
import java.time.Instant;

@UserDefinedType("direct_chat_user")
public class DirectChatUser {

    @CassandraType(type = CassandraType.Name.UUID)
    private UUID userId;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String avatarUrl;

    @CassandraType(type = CassandraType.Name.TIMESTAMP)
    private Instant joinedAt;

    public DirectChatUser(UUID userId, String name, String avatarUrl, Instant joinedAt) {
        this.userId = userId;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.joinedAt = joinedAt;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }
}
