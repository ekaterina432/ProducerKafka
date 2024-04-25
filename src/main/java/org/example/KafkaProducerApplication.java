package org.example;

import org.springframework.boot.SpringApplication;

public interface KafkaProducerApplication {
    static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplicationImpl.class, args);
    }

    void run(String... args) throws Exception;
}
