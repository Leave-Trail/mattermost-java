package com.leavetrail.chat.configuration;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.pubsub.v1.MessageReceiver;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.cloud.pubsub.v1.Subscriber;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.ProjectTopicName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class PubSubConfig {

    @Value("${google.project.id}")
    private String projectId;

    @Bean
    public Publisher publisher() throws IOException {
        ProjectTopicName topicName = ProjectTopicName.of(projectId, "chat-messages");
        GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();
        return Publisher.newBuilder(topicName)
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .build();
    }

    @Bean
    public Subscriber subscriber(MessageReceiver messageReceiver) throws IOException {
        ProjectSubscriptionName subscriptionName = ProjectSubscriptionName.of(projectId, "chat-messages-subscription");
        GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();
        return Subscriber.newBuilder(subscriptionName, messageReceiver)
                .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
                .build();
    }
}
