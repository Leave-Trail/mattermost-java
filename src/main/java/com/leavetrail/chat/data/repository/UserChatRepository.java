package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;


import com.leavetrail.chat.model.UserChat;


public interface UserChatRepository extends CassandraRepository<UserChat, UserChat.Key> {
}

