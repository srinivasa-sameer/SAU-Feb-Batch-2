package com.ordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        System.out.println("Starting on port 8080");
        SpringApplication.run(ApplicationStarter.class, args);
        System.out.println("Started on port 8080\n");
    }
}