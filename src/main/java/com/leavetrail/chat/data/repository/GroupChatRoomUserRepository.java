package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.leavetrail.chat.model.GroupChatRoomUser;

@Repository
public interface GroupChatRoomUserRepository extends CassandraRepository<GroupChatRoomUser, GroupChatRoomUser.ChatRoomUserKey> {
}

