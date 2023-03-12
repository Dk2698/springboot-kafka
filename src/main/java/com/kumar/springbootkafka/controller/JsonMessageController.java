package com.kumar.springbootkafka.controller;

import com.kumar.springbootkafka.kafka.JsonKafkaProducer;
import com.kumar.springbootkafka.kafka.KafkaProducer;
import com.kumar.springbootkafka.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    // http:localhost:8080/api/v1/kafka/publish?message=hello world
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok(" Json message sent to the topic");
    }
}
