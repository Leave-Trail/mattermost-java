package com.leavetrail.chat.service;

import java.util.UUID;

import com.leavetrail.chat.model.Message;
import com.leavetrail.chat.model.UserChat;

public interface DirectChatService {
    UserChat createDirectChat(UUID user1Id, UUID user2Id);

    UserChat addUserToDirectChat(UUID directChatId, UUID userId);

    Message addMessageToDirectChat(UUID directChatId, UUID userId, String content);
}
