package com.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {
    public static void main(String[] args) {
        System.out.println("Starting Order Management System Application on port 8000");
        SpringApplication.run(Start.class, args);
        System.out.println("Started Order Management System Application on port 8000\n");
    }
}