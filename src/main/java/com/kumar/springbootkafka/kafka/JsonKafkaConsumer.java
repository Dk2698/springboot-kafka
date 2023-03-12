package com.kumar.springbootkafka.kafka;

import com.kumar.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private  static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "json-demo", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Received Message: %s", user.toString()));

    }
}
