package com.leavetrail.chat.controller.dto;

import java.util.UUID;

public class DirectChatMessage {
    private UUID directChatId;
    private String content;


    
    public DirectChatMessage(UUID directChatId, String content) {
        this.directChatId = directChatId;
        this.content = content;
    }
    public DirectChatMessage() {
    }
    public UUID getDirectChatId() {
        return directChatId;
    }
    public void setDirectChatId(UUID directChatId) {
        this.directChatId = directChatId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "DirectChatMessage [directChatId=" + directChatId + ", content=" + content + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DirectChatMessage other = (DirectChatMessage) obj;
        if (directChatId == null) {
            if (other.directChatId != null)
                return false;
        } else if (!directChatId.equals(other.directChatId))
            return false;
        if (content == null) {
            if (other.content != null)
                return false;
        } else if (!content.equals(other.content))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((directChatId == null) ? 0 : directChatId.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        return result;
    }

    // Getters and setters
}
