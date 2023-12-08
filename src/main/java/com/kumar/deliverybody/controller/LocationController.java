package com.kumar.deliverybody.controller;

import com.kumar.deliverybody.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() throws InterruptedException {
        int range = 100;
        while (range > 0){
            this.kafkaService.updateLocation("("+ Math.round(Math.random()*100)+" , "+ Math.round(Math.random() *100)+ ")");
            Thread.sleep(1000);
            range--;
        }
        return  new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }
}
