package com.mehdi.kafka_microservice;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "mehdicode",
    groupId = "groupId")
    void Listener(String data){
        System.out.println("Listener received "+data+" Hi Neighbors");

    }

}
