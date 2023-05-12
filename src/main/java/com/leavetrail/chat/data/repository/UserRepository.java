package com.leavetrail.chat.data.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.datastax.astra.sdk.organizations.domain.User;

import java.util.UUID;

@Repository
public interface UserRepository extends CassandraRepository<User, UUID> {
}
