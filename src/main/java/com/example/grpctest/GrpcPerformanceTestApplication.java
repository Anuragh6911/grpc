package com.example.grpctest;

import com.example.grpctest.cilents.CalculatorClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcPerformanceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcPerformanceTestApplication.class, args);
    }
}
