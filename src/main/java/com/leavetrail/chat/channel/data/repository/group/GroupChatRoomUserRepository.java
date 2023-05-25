package com.leavetrail.chat.channel.data.repository.group;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.leavetrail.chat.channel.model.group.GroupChatRoomUser;

@Repository
public interface GroupChatRoomUserRepository extends CassandraRepository<GroupChatRoomUser, GroupChatRoomUser.ChatRoomUserKey> {
}

