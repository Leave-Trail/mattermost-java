package com.leavetrail.chat.channel.data.repository.group;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.leavetrail.chat.channel.model.group.Message;

import java.util.UUID;


public interface MessageRepository extends CassandraRepository<Message, UUID> {
}
