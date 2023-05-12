package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.leavetrail.chat.model.UserChat;

@Repository
public interface UserChatRepository extends CassandraRepository<UserChat, UserChat.Key> {
}

