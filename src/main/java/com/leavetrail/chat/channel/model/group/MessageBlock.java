package com.leavetrail.chat.channel.model.group;

import java.time.Instant;
import java.util.List;


public class MessageBlock {

    List<Message> messages;
    String nextPageToken;
    Instant pageTimestamp;
    
    public MessageBlock(List<Message> messages, String nextPageToken, Instant pageTimestamp) {
        this.messages = messages;
        this.nextPageToken = nextPageToken;
        this.pageTimestamp = pageTimestamp;
    }

    public MessageBlock() {
    }
    public List<Message> getMessages() {
        return messages;
    }
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    public String getNextPageToken() {
        return nextPageToken;
    }
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    public Instant getPageTimestamp() {
        return pageTimestamp;
    }
    public void setPageTimestamp(Instant pageTimestamp) {
        this.pageTimestamp = pageTimestamp;
    }
    @Override
    public String toString() {
        return "MessageBlock [messages=" + messages + ", nextPageToken=" + nextPageToken + ", pageTimestamp="
                + pageTimestamp + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MessageBlock other = (MessageBlock) obj;
        if (messages == null) {
            if (other.messages != null)
                return false;
        } else if (!messages.equals(other.messages))
            return false;
        if (nextPageToken == null) {
            if (other.nextPageToken != null)
                return false;
        } else if (!nextPageToken.equals(other.nextPageToken))
            return false;
        if (pageTimestamp == null) {
            if (other.pageTimestamp != null)
                return false;
        } else if (!pageTimestamp.equals(other.pageTimestamp))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((messages == null) ? 0 : messages.hashCode());
        result = prime * result + ((nextPageToken == null) ? 0 : nextPageToken.hashCode());
        result = prime * result + ((pageTimestamp == null) ? 0 : pageTimestamp.hashCode());
        return result;
    }
    
}
