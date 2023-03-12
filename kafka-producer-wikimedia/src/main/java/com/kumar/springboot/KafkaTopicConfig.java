package com.kumar.springboot;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic demoTopic(){
        return TopicBuilder.name("wikimedia-recent-change")
                .partitions(20)
                .build();
    }


}
