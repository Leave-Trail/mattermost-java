package com.leavetrail.chat.data.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;


import com.leavetrail.chat.model.UserGroupMember;


public interface UserGroupMemberRepository extends CassandraRepository<UserGroupMember, UserGroupMember.Key> {

    void deleteAllByGroupId(UUID groupId);
}
