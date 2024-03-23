package com.kafka.user.userKafka.controller;

import com.kafka.user.userKafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateUserData() {
        for(int i=1;i<=100000;i++) {
            this.kafkaService.updateUserDetails("test for producer");
        }
        return new ResponseEntity<>(Map.of("Massage","updated"),HttpStatus.OK);
    }
}
