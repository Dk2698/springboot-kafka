package com.kumar.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public NewTopic demoTopic(){
        return TopicBuilder.name("demo")
                .partitions(10)
                .build();
    }


    public NewTopic jsonTopic(){
        return TopicBuilder.name("json-demo")
                .build();
    }

}
