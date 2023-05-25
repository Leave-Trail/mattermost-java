package com.leavetrail.chat.channel.data.repository.group;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.leavetrail.chat.channel.model.group.GroupChatRoom;

import java.util.UUID;
import java.util.List;


@Repository
public interface GroupChatRoomRepository extends CassandraRepository<GroupChatRoom, UUID> {

    List<GroupChatRoom> findByGroupId(UUID groupId);
    void deleteAllByGroupId(UUID groupId);

}

