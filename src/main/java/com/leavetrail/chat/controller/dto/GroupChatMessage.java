package com.leavetrail.chat.controller.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class GroupChatMessage {
    private UUID chatRoomId;
    private String content;

    // Getters and setters
}

