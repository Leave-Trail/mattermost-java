package com.leavetrail.chat.channel.service;

import java.util.UUID;

import com.leavetrail.chat.channel.model.direct.DirectChat;
import com.leavetrail.chat.channel.model.group.GroupChatRoomUser;
import com.leavetrail.chat.channel.model.group.Message;

public interface DirectChatService {
    DirectChat createDirectChat(UUID user1Id, UUID user2Id);

    GroupChatRoomUser addUserToDirectChat(UUID groupId, UUID directChatId, UUID userId);

    Message addMessageToDirectChat(UUID directChatId, UUID userId, String content);
}
