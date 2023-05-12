package com.leavetrail.chat.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.Data;

import java.util.UUID;
import java.time.Instant;

@Table("messages")
@Data
public class Message {

    @PrimaryKey
    public UUID id;
    @Column("chat_room_id")
    public UUID chatRoomId;
    @Column("user_id")
    public UUID userId;
    public String content;
    public Instant timestamp;

    // Getters, setters, and other methods go here

 

}
