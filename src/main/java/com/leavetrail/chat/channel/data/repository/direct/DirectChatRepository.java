package com.leavetrail.chat.channel.data.repository.direct;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.leavetrail.chat.channel.model.direct.DirectChat;


public interface DirectChatRepository extends CassandraRepository<DirectChat, DirectChat.DirectChatKey> {
}

