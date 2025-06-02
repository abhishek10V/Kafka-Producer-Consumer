package com.example.Kafka_producer_consumer.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = {"gadgets"}, groupId = "abc")
    public void consumeMessage(String mssg){
        System.out.println(mssg);
    }
}
