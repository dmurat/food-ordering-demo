package io.axoniq.foodordering;

import io.axoniq.foodordering.infrastructure.MyHandlerEnhancerDefinition;
import org.axonframework.messaging.annotation.HandlerEnhancerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoodOrderingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodOrderingApplication.class, args);
    }

    @Bean
    HandlerEnhancerDefinition myHandlerEnhancerDefinition() {
        return new MyHandlerEnhancerDefinition();
    }
}
