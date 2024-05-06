package com.s686.mall.s686mallmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S686mallMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(S686mallMasterApplication.class, args);
    }

}