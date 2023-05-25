package com.leavetrail.chat.channel.model.group;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("group_chat_room_users")
public class GroupChatRoomUser {

    @PrimaryKeyClass
    public static class ChatRoomUserKey {
        @PrimaryKeyColumn(name = "group_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
        private UUID groupId;

        @PrimaryKeyColumn(name = "chat_room_id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
        private UUID chatRoomId;

        @PrimaryKeyColumn(name = "user_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
        private UUID userId;

        public ChatRoomUserKey(UUID groupId, UUID chatRoomId, UUID userId) {
            this.groupId = groupId;
            this.chatRoomId = chatRoomId;
            this.userId = userId;
        }
        // Getters and setters
    }

    @PrimaryKey
    private ChatRoomUserKey key;
    private Instant joinedAt;
    @Column("is_admin")
    private boolean isAdmin;
    public GroupChatRoomUser(ChatRoomUserKey key, Instant joinedAt, boolean isAdmin) {
        this.key = key;
        this.joinedAt = joinedAt;
        this.isAdmin = isAdmin;
    }
    public GroupChatRoomUser() {
    }
    public ChatRoomUserKey getKey() {
        return key;
    }
    public void setKey(ChatRoomUserKey key) {
        this.key = key;
    }
    public Instant getJoinedAt() {
        return joinedAt;
    }
    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    @Override
    public String toString() {
        return "GroupChatRoomUser [key=" + key + ", joinedAt=" + joinedAt + ", isAdmin=" + isAdmin + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupChatRoomUser other = (GroupChatRoomUser) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (joinedAt == null) {
            if (other.joinedAt != null)
                return false;
        } else if (!joinedAt.equals(other.joinedAt))
            return false;
        if (isAdmin != other.isAdmin)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((joinedAt == null) ? 0 : joinedAt.hashCode());
        result = prime * result + (isAdmin ? 1231 : 1237);
        return result;
    }

    // Getters, setters, and other methods go here
}
