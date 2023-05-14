package com.leavetrail.chat.model;



import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;

import java.util.UUID;
import java.time.Instant;

@Table("group_chat_rooms")
public class GroupChatRoom {

    @PrimaryKeyClass
    public static class GroupChatRoomKey {
        @PrimaryKeyColumn(name = "group_id", type = PrimaryKeyType.PARTITIONED)
        private UUID groupId;

        @PrimaryKeyColumn(name = "id", type = PrimaryKeyType.CLUSTERED)
        private UUID id;

        // Getters and setters
    }

    @PrimaryKey
    private GroupChatRoomKey key;
    @Column("name")
    private String name;
    @Column("created_at")
    private Instant created_at;

    public GroupChatRoom() {}

    public GroupChatRoom(UUID groupId, UUID id, String name, Instant created_at) {
        this.key = new GroupChatRoomKey();
        this.key.groupId = groupId;
        this.key.id = id;
        this.name = name;
        this.created_at = created_at;
    }

    public GroupChatRoomKey getKey() {
        return key;
    }

    public void setKey(GroupChatRoomKey key) {
        this.key = key;
    }

    public UUID getGroupId() {
        return key.groupId;
    }

    public void setGroupId(UUID groupId) {
        this.key.groupId = groupId;
    }

    public UUID getId() {
        return key.id;
    }

    public void setId(UUID id) {
        this.key.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Instant created_at) {
        this.created_at = created_at;
    }
}
