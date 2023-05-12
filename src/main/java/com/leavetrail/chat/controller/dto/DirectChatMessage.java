package com.leavetrail.chat.controller.dto;

import java.util.UUID;
import lombok.Data;

@Data
public class DirectChatMessage {
    private UUID directChatId;
    private String content;

    // Getters and setters
}
