package com.leavetrail.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.google.cloud.pubsub.v1.Publisher;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.leavetrail.chat.controller.dto.DirectChatMessage;
import com.leavetrail.chat.controller.dto.GroupChatMessage;
import com.leavetrail.chat.model.Message;
import com.leavetrail.chat.service.DirectChatService;
import com.leavetrail.chat.service.GroupService;

import java.security.Principal;
import java.util.UUID;

@Controller
public class WebSocketController {

    @Autowired
    private DirectChatService directChatService;

    @Autowired
    private GroupService groupService;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private Publisher publisher;


    @MessageMapping("/direct-chat-message")
    public void directChatMessage(DirectChatMessage directChatMessage, Principal principal) {
        Message message = directChatService.addMessageToDirectChat(directChatMessage.getDirectChatId(), UUID.fromString(principal.getName()), directChatMessage.getContent());
        messagingTemplate.convertAndSend("/topic/direct-chat/" + directChatMessage.getDirectChatId(), message);
        
        PubsubMessage pubsubMessage = PubsubMessage.newBuilder()
                .setData(ByteString.copyFromUtf8(message.getContent()))
                .putAttributes("chatRoomId", directChatMessage.getDirectChatId().toString())
                .build();

        publisher.publish(pubsubMessage);
    
    }

    @MessageMapping("/group-chat-message")
    public void groupChatMessage(GroupChatMessage groupChatMessage, Principal principal) {
        Message message = groupService.addMessageToChatRoom(groupChatMessage.getChatRoomId(), UUID.fromString(principal.getName()), groupChatMessage.getContent());
        messagingTemplate.convertAndSend("/topic/group-chat/" + groupChatMessage.getChatRoomId(), message);

        PubsubMessage pubsubMessage = PubsubMessage.newBuilder()
                .setData(ByteString.copyFromUtf8(message.getContent()))
                .putAttributes("chatRoomId", groupChatMessage.getChatRoomId().toString())
                .build();
        publisher.publish(pubsubMessage);
    }

    @MessageMapping("/join-chat")
    @SendTo("/topic/join-chat")
    public String joinChat(Principal principal) {
        return principal.getName() + " joined the chat";
    }

    @MessageMapping("/leave-chat")
    @SendTo("/topic/leave-chat")
    public String leaveChat(Principal principal) {
        return principal.getName() + " left the chat";
    }
}
