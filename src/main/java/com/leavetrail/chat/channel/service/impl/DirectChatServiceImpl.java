package com.leavetrail.chat.channel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import com.leavetrail.chat.channel.data.repository.UserRepository;
import com.leavetrail.chat.channel.data.repository.direct.DirectChatRepository;
import com.leavetrail.chat.channel.data.repository.group.GroupChatRoomRepository;
import com.leavetrail.chat.channel.data.repository.group.GroupChatRoomUserRepository;
import com.leavetrail.chat.channel.data.repository.group.MessageRepository;
import com.leavetrail.chat.channel.data.repository.group.UserGroupMemberRepository;
import com.leavetrail.chat.channel.data.repository.group.UserGroupRepository;
import com.leavetrail.chat.channel.model.direct.DirectChat;
import com.leavetrail.chat.channel.model.group.GroupChatRoom;
import com.leavetrail.chat.channel.model.group.GroupChatRoomUser;
import com.leavetrail.chat.channel.model.group.Message;
import com.leavetrail.chat.channel.service.DirectChatService;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.UUID;

@Service
public class DirectChatServiceImpl implements DirectChatService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserGroupRepository userGroupRepository;

    @Autowired
    private UserGroupMemberRepository userGroupMemberRepository;

    @Autowired
    private GroupChatRoomRepository groupChatRoomRepository;

    @Autowired
    private GroupChatRoomUserRepository groupChatRoomUserRepository;

    @Autowired
    private MessageRepository messageRepository;

    public DirectChatServiceImpl(UserRepository userRepository, UserGroupRepository userGroupRepository,
            UserGroupMemberRepository userGroupMemberRepository, GroupChatRoomRepository groupChatRoomRepository,
            GroupChatRoomUserRepository groupChatRoomUserRepository, MessageRepository messageRepository) {
        this.userRepository = userRepository;
        this.userGroupRepository = userGroupRepository;
        this.userGroupMemberRepository = userGroupMemberRepository;
        this.groupChatRoomRepository = groupChatRoomRepository;
        this.groupChatRoomUserRepository = groupChatRoomUserRepository;
        this.messageRepository = messageRepository;
    }

    @Override
    public DirectChat createDirectChat(UUID user1Id, UUID user2Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDirectChat'");
    }

    /**
     * Add new user to a direct chat
     * @param directChatId the id of the direct chat
     * @param userId the id of the user to add
     * @return the updated direct chat
    */
    @Override
    public GroupChatRoomUser addUserToDirectChat(UUID groupId, UUID directChatId, UUID userId) {

        GroupChatRoomUser member = new GroupChatRoomUser();
        member.setKey(new GroupChatRoomUser.ChatRoomUserKey(groupId, directChatId, userId));
        member.setAdmin(false);
        member.setJoinedAt(Instant.now());
        
        groupChatRoomUserRepository.save(member);
        return member;
    }

     /**
     * Add a message to a direct chat
     * @param directChatId the id of the direct chat
     * @param userId the id of the user sending the message
     * @param content the content of the message
    */
    @Override
    public Message addMessageToDirectChat(UUID directChatId, UUID userId, String content) {
        try{
        Instant timestamp = Instant.now();
        LocalDate pageTimestamp = LocalDate.ofInstant(timestamp, ZoneOffset.UTC);

        Message message = new Message();
        message.setKey(new Message.MessageKey(directChatId, pageTimestamp, UUID.randomUUID()));
        message.setUserId(userId);
        message.setContent(content);
        message.setTimestamp(timestamp);
        messageRepository.save(message);

        return message;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    
}
