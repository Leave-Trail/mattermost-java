package com.leavetrail.chat.channel.model.direct;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
import java.time.Instant;

@Table("direct_chats")
public class DirectChat {

    @PrimaryKey
    private DirectChatKey key;

    @Column
    private String name;

    @Column
    private List<DirectChatUser> chatUsers;

    @Column
    private Instant createdAt;

    public DirectChat(DirectChatKey key, String name, List<DirectChatUser> chatUsers, Instant createdAt) {
        this.key = key;
        this.name = name;
        this.chatUsers = chatUsers;
        this.createdAt = createdAt;
    }

    public DirectChatKey getKey() {
        return key;
    }

    public void setKey(DirectChatKey key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DirectChatUser> getChatUsers() {
        return chatUsers;
    }

    public void setChatUsers(List<DirectChatUser> chatUsers) {
        this.chatUsers = chatUsers;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @PrimaryKeyClass
    public class DirectChatKey {

        @PrimaryKeyColumn(name = "user_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
        private UUID userId;

        @PrimaryKeyColumn(name = "chat_id", ordinal = 1,type = PrimaryKeyType.CLUSTERED)
        private UUID chatId;

        public DirectChatKey(UUID userId, UUID chatId) {
            this.userId = userId;
            this.chatId = chatId;
        }
    }
}