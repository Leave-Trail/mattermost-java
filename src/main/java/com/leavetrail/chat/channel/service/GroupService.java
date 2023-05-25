package com.leavetrail.chat.channel.service;


import java.util.List;
import java.util.UUID;

import com.leavetrail.chat.channel.model.group.GroupChatRoom;
import com.leavetrail.chat.channel.model.group.GroupChatRoomUser;
import com.leavetrail.chat.channel.model.group.Message;
import com.leavetrail.chat.channel.model.group.UserGroup;
import com.leavetrail.chat.channel.model.group.UserGroupMember;

public interface GroupService {
    UserGroup createGroup(String name,String description, UUID creatorId);

    UserGroupMember addUserToGroup(UUID groupId, UUID userId);

    void removeUserFromGroup(UUID groupId, UUID userId);

    UserGroup updateGroupInfo(UUID groupId, String newName);

    GroupChatRoom createChatRoom(UUID groupId, String name);

    GroupChatRoomUser addUserToChatRoom(UUID groupId, UUID chatRoomId, UUID userId);

    Message addMessageToChatRoom(UUID chatRoomId, UUID userId, String content);

    void deleteGroup(UUID groupId);

    void deleteChatRoom(UUID groupId, UUID roomId);
}

