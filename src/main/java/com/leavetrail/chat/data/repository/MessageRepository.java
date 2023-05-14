package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;


import com.leavetrail.chat.model.Message;

import java.util.UUID;


public interface MessageRepository extends CassandraRepository<Message, UUID> {
}
