package com.kafka.user.userKafka.service;

import com.kafka.user.userKafka.appconstant.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Logger log = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateUserDetails(String data) {
        kafkaTemplate.send(AppConstant.USER_EVENT, data);
        log.info("Data Produce in topic");
        return true;
    }
}
