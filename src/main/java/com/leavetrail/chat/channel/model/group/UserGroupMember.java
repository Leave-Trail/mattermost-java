package com.leavetrail.chat.channel.model.group;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_group_members")
public class UserGroupMember {

    @PrimaryKeyClass
    public static class Key {
        public Key(UUID groupId, UUID creatorId) {
            this.groupId = groupId;
            this.userId = creatorId;
        }

        @PrimaryKeyColumn(name = "group_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
        private UUID groupId;

        @PrimaryKeyColumn(name = "user_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
        private UUID userId;

        // Getters, setters, and other methods go here
    }

    @PrimaryKey
    private Key key;
    private Instant joinedAt;
    private boolean isAdmin;

    // Getters, setters, and other methods go here

    /**
     * @return UUID return the groupId
     */
    public UUID getGroupId() {
        return key.groupId;
    }

    /**
     * @param groupId the groupId to set
     */
    public void setGroupId(UUID groupId) {
        this.key.groupId = groupId;
    }

    /**
     * @return UUID return the userId
     */
    public UUID getUserId() {
        return key.userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(UUID userId) {
        this.key.userId = userId;
    }



    /**
     * @return boolean return the isAdmin
     */
    public boolean isIsAdmin() {
        return isAdmin;
    }

    /**
     * @param isAdmin the isAdmin to set
     */
    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public UserGroupMember(Key key, Instant joinedAt, boolean isAdmin) {
        this.key = key;
        this.joinedAt = joinedAt;
        this.isAdmin = isAdmin;
    }

    public UserGroupMember() {
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
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
        return "UserGroupMember [key=" + key + ", joinedAt=" + joinedAt + ", isAdmin=" + isAdmin + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserGroupMember other = (UserGroupMember) obj;
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

}
