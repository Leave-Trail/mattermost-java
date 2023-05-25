package com.leavetrail.chat.channel.data.repository.group;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.leavetrail.chat.channel.model.group.UserGroupMember;


public interface UserGroupMemberRepository extends CassandraRepository<UserGroupMember, UserGroupMember.Key> {

    void deleteAllByGroupId(UUID groupId);
}
