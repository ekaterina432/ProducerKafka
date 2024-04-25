package org.example;

import org.example.KafkaProducerApplication;
import org.example.component.KafkaMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example")
public class KafkaProducerApplicationImpl implements KafkaProducerApplication, CommandLineRunner {

    @Autowired
    private KafkaMessageProducer kafkaMessageProducer;

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplicationImpl.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String topic = "topic-kafka-spring";
        String key = "1";
        String message = "Hello, Kafka!";

        kafkaMessageProducer.sendMessage(topic, key, message);
    }
}
