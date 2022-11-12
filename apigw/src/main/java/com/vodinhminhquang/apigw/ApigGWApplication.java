package com.vodinhminhquang.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ApigGWApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApigGWApplication.class, args);
    }
}