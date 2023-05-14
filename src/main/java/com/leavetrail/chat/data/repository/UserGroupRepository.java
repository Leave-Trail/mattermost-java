package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.leavetrail.chat.model.UserGroup;

import java.util.UUID;


public interface UserGroupRepository extends CassandraRepository<UserGroup, UUID> {
}
