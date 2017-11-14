package com.github.kalev181.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class StockSpringBootStarter {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StockSpringBootStarter.class, args);
    }
}
