package com.leavetrail.chat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leavetrail.chat.data.repository.MessageRepository;
import com.leavetrail.chat.data.repository.UserChatRepository;
import com.leavetrail.chat.data.repository.UserRepository;
import com.leavetrail.chat.model.Message;
import com.leavetrail.chat.model.UserChat;
import com.leavetrail.chat.service.DirectChatService;

import java.time.Instant;
import java.util.UUID;

@Service
public class DirectChatServiceImpl implements DirectChatService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserChatRepository userChatRepository;

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public UserChat createDirectChat(UUID user1Id, UUID user2Id) {
        UserChat userChat1 = new UserChat();
        userChat1.setKey(new UserChat.Key(UUID.randomUUID(), user1Id, user2Id));
        userChat1.setCreatedAt(Instant.now());
        userChatRepository.save(userChat1);

        UserChat userChat2 = new UserChat();
        userChat2.setKey(new UserChat.Key(userChat1.getKey().getUserChatId(), user2Id, user1Id));
        userChat2.setCreatedAt(Instant.now());
        userChatRepository.save(userChat2);

        return userChat1;
    }

    @Override
    public UserChat addUserToDirectChat(UUID directChatId, UUID userId) {
        UserChat existingDirectChat = userChatRepository.findById(new UserChat.Key(directChatId, userId, userId))
                .orElseThrow(() -> new RuntimeException("Direct chat not found"));

        UserChat newUserChat = new UserChat();
        newUserChat.setKey(new UserChat.Key(directChatId, userId, userId));
        newUserChat.setCreatedAt(Instant.now());
        userChatRepository.save(newUserChat);

        return newUserChat;
    }

    @Override
    public Message addMessageToDirectChat(UUID directChatId, UUID userId, String content) {
        Message message = new Message();
        message.setId(UUID.randomUUID());
        message.setChatRoomId(directChatId);
        message.setUserId(userId);
        message.setContent(content);
        message.setTimestamp(Instant.now());
        messageRepository.save(message);

        return message;
    }
}
