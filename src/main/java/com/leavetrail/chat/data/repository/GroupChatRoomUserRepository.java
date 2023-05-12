package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupChatRoomUserRepository extends CassandraRepository<GroupChatRoomUser, GroupChatRoomUser.Key> {
}

