package com.leavetrail.chat.model;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("users")
public class User {

    @PrimaryKey
    private UUID id;
    private String username;
    private String email;
    @Column("password_hash")
    private String passwordHash;
    @Column("display_name")
    private String displayName;
    @Column("avatar_url")
    private String avatarUrl;
    @Column("last_seen")
    private Instant lastSeen;
    @Column("created_at")
    private Instant createdAt;
    public User(UUID id, String username, String email, String passwordHash, String displayName, String avatarUrl,
            Instant lastSeen, Instant createdAt) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
        this.lastSeen = lastSeen;
        this.createdAt = createdAt;
    }
    public User() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public Instant getLastSeen() {
        return lastSeen;
    }
    public void setLastSeen(Instant lastSeen) {
        this.lastSeen = lastSeen;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + ", passwordHash=" + passwordHash
                + ", displayName=" + displayName + ", avatarUrl=" + avatarUrl + ", lastSeen=" + lastSeen
                + ", createdAt=" + createdAt + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (passwordHash == null) {
            if (other.passwordHash != null)
                return false;
        } else if (!passwordHash.equals(other.passwordHash))
            return false;
        if (displayName == null) {
            if (other.displayName != null)
                return false;
        } else if (!displayName.equals(other.displayName))
            return false;
        if (avatarUrl == null) {
            if (other.avatarUrl != null)
                return false;
        } else if (!avatarUrl.equals(other.avatarUrl))
            return false;
        if (lastSeen == null) {
            if (other.lastSeen != null)
                return false;
        } else if (!lastSeen.equals(other.lastSeen))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!createdAt.equals(other.createdAt))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((passwordHash == null) ? 0 : passwordHash.hashCode());
        result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
        result = prime * result + ((avatarUrl == null) ? 0 : avatarUrl.hashCode());
        result = prime * result + ((lastSeen == null) ? 0 : lastSeen.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        return result;
    }

    // Getters, setters, and other methods go here
}
