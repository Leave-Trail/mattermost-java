package com.leavetrail.chat.channel.component;

import com.google.cloud.pubsub.v1.AckReplyConsumer;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.pubsub.v1.PubsubMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageReceiver implements MessageReceiver {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Override
    public void receiveMessage(PubsubMessage message, AckReplyConsumer consumer) {
        String chatRoomId = message.getAttributesOrDefault("chatRoomId", "");
        messagingTemplate.convertAndSend("/topic/group-chat/" + chatRoomId, message.getData().toStringUtf8());
        consumer.ack();
    }
}
