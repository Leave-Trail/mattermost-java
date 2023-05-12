package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.leavetrail.chat.model.UserGroupMember;

@Repository
public interface UserGroupMemberRepository extends CassandraRepository<UserGroupMember, UserGroupMember.Key> {
}
