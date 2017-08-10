package ru.alfabank.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ApplePayService {
    public static void main(String[] args) {
        SpringApplication.run(ApplePayService.class, args);
    }
}
