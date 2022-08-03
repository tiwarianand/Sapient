package com.test.theater.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TheaterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheaterServiceApplication.class, args);
    }

}