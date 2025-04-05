package com.mehdi.kafka_microservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaMicroserviceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(KafkaMicroserviceApplication.class, args);
    }


    @Bean
CommandLineRunner commandLineRunner(KafkaTemplate<String,String>kafkaTemplate){
        return  args -> {
            for(int i = 0;i<100;i++) {
                kafkaTemplate.send("mehdicode", "Hello World");

            }};
}
}
