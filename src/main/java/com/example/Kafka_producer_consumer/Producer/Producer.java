package com.example.Kafka_producer_consumer.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping("/send")
        public void sendMessage(@RequestParam String message){
        kafkaTemplate.send("gadgets", message);
    }

}
