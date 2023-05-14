package com.leavetrail.chat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leavetrail.chat.data.repository.GroupChatRoomRepository;
import com.leavetrail.chat.data.repository.GroupChatRoomUserRepository;
import com.leavetrail.chat.data.repository.MessageRepository;
import com.leavetrail.chat.data.repository.UserGroupMemberRepository;
import com.leavetrail.chat.data.repository.UserGroupRepository;
import com.leavetrail.chat.data.repository.UserRepository;
import com.leavetrail.chat.model.GroupChatRoom;
import com.leavetrail.chat.model.GroupChatRoomUser;
import com.leavetrail.chat.model.Message;
import com.leavetrail.chat.model.UserGroup;
import com.leavetrail.chat.model.UserGroupMember;
import com.leavetrail.chat.service.GroupService;

import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class GroupServiceImpl implements GroupService {

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

    @Override
    public UserGroup createGroup(String name, String description, UUID creatorId) {
        UserGroup group = new UserGroup();
        group.setId(UUID.randomUUID());
        group.setName(name);
        group.setCreatedAt(Instant.now());
        userGroupRepository.save(group);

        UserGroupMember creator = new UserGroupMember();
        creator.setKey(new UserGroupMember.Key(group.getId(), creatorId));
        creator.setJoinedAt(Instant.now());
        creator.setIsAdmin(true);
        userGroupMemberRepository.save(creator);

        return group;
    }

    @Override
    public UserGroupMember addUserToGroup(UUID groupId, UUID userId) {
        UserGroupMember userGroupMember = new UserGroupMember();
        userGroupMember.setKey(new UserGroupMember.Key(groupId, userId));
        userGroupMember.setJoinedAt(Instant.now());
        userGroupMember.setIsAdmin(false);
        userGroupMemberRepository.save(userGroupMember);

        return userGroupMember;
    }

    @Override
    public void removeUserFromGroup(UUID groupId, UUID userId) {
        userGroupMemberRepository.deleteById(new UserGroupMember.Key(groupId, userId));
    }

    @Override
    public UserGroup updateGroupInfo(UUID groupId, String newName) {
        UserGroup group = userGroupRepository.findById(groupId).orElseThrow(() -> new RuntimeException("Group not found"));
        group.setName(newName);
        userGroupRepository.save(group);

        return group;
    }

    @Override
    public GroupChatRoom createChatRoom(UUID groupId, String name) {
        GroupChatRoom chatRoom = new GroupChatRoom();
        chatRoom.setId(UUID.randomUUID());
        chatRoom.setGroupId(groupId);
        chatRoom.setName(name);
        chatRoom.setCreatedAt(Instant.now());
        groupChatRoomRepository.save(chatRoom);

        return chatRoom;
    }

    @Override
    public GroupChatRoomUser addUserToChatRoom(UUID groupId, UUID chatRoomId, UUID userId) {
        GroupChatRoomUser chatRoomUser = new GroupChatRoomUser();
        chatRoomUser.setKey(new GroupChatRoomUser.ChatRoomUserKey(groupId,chatRoomId, userId));
        chatRoomUser.setJoinedAt(Instant.now());
        chatRoomUser.setAdmin(false);
        groupChatRoomUserRepository.save(chatRoomUser);

        return chatRoomUser;
    }



    @Override
    public Message addMessageToChatRoom(UUID chatRoomId, UUID userId, String content) {
        Message message = new Message();
        message.setKey(new Message.MessageKey(chatRoomId,LocalDate.now(), UUID.randomUUID())   );
        message.setUserId(userId);
        message.setContent(content);
        message.setTimestamp(Instant.now());
        messageRepository.save(message);

        return message;
    }


    @Override
    public void deleteGroup(UUID groupId) {
        groupChatRoomRepository.deleteAllByGroupId(groupId);
        userGroupMemberRepository.deleteAllByGroupId(groupId);
        userGroupRepository.deleteById(groupId);

    }

    @Override
    public void deleteChatRoom(UUID groupId, UUID roomId) {
        groupChatRoomRepository.deleteById(roomId);
    }
}
