package com.client.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;

public class KafkaConfig {
    @Bean
    public NewTopic newTopic() {
        return new NewTopic("order-topic", 3, (short) 1);
    }
}
