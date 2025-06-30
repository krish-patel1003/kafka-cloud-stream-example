package com.demo.producer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
        return () -> {
            RiderLocation location = new RiderLocation("rider123", 67.99, 78.00);
            System.out.println("Sending Rider location: " + location.getRiderId());
            return location;
        };
    }
}
