package com.leavetrail.chat.channel.data.repository.group;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.leavetrail.chat.channel.model.group.UserGroup;

import java.util.UUID;


public interface UserGroupRepository extends CassandraRepository<UserGroup, UUID> {
}
