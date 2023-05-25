package com.leavetrail.chat.channel.data.repository;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class ChatPartitionMetadataRepository {
    private final CqlSession cqlSession;

    @Autowired
    public ChatPartitionMetadataRepository(CqlSession cqlSession) {
        this.cqlSession = cqlSession;
    }

    public void savePartition(UUID chatId, LocalDate date) {
        cqlSession.execute("INSERT INTO chat_partition_metadata (chat_id, date) VALUES (?, ?)", chatId, date);
    }

    public List<LocalDate> getPartitions(UUID chatId) {
        ResultSet resultSet = cqlSession.execute("SELECT date FROM chat_partition_metadata WHERE chat_id = ?", chatId);
        return resultSet.all().stream().map(row -> row.get("date", LocalDate.class)).collect(Collectors.toList());
    }
}
