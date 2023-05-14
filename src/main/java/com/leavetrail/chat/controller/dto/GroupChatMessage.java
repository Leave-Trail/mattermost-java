package com.leavetrail.chat.controller.dto;

import java.util.UUID;

public class GroupChatMessage {
    private UUID chatRoomId;
    private String content;

    
    public GroupChatMessage(UUID chatRoomId, String content) {
        this.chatRoomId = chatRoomId;
        this.content = content;
    }
    public GroupChatMessage() {
    }
    public UUID getChatRoomId() {
        return chatRoomId;
    }
    public void setChatRoomId(UUID chatRoomId) {
        this.chatRoomId = chatRoomId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "GroupChatMessage [chatRoomId=" + chatRoomId + ", content=" + content + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupChatMessage other = (GroupChatMessage) obj;
        if (chatRoomId == null) {
            if (other.chatRoomId != null)
                return false;
        } else if (!chatRoomId.equals(other.chatRoomId))
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
        result = prime * result + ((chatRoomId == null) ? 0 : chatRoomId.hashCode());
        result = prime * result + ((content == null) ? 0 : content.hashCode());
        return result;
    }

    // Getters and setters
}

