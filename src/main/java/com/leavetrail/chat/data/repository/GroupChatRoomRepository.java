package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.leavetrail.chat.model.GroupChatRoom;

import java.util.UUID;

@Repository
public interface GroupChatRoomRepository extends CassandraRepository<GroupChatRoom, UUID> {
}

