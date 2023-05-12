package com.leavetrail.chat.service;


import java.util.List;
import java.util.UUID;

import com.leavetrail.chat.model.GroupChatRoom;
import com.leavetrail.chat.model.GroupChatRoomUser;
import com.leavetrail.chat.model.Message;
import com.leavetrail.chat.model.UserGroup;
import com.leavetrail.chat.model.UserGroupMember;

public interface GroupService {
    UserGroup createGroup(String name, UUID creatorId);

    UserGroupMember addUserToGroup(UUID groupId, UUID userId);

    void removeUserFromGroup(UUID groupId, UUID userId);

    UserGroup updateGroupInfo(UUID groupId, String newName);

    GroupChatRoom createChatRoom(UUID groupId, String name);

    GroupChatRoomUser addUserToChatRoom(UUID chatRoomId, UUID userId);

    Message addMessageToChatRoom(UUID chatRoomId, UUID userId, String content);
}

