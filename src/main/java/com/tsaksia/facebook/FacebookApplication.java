package com.tsaksia.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "com.tsaksia.facebook.webservice")
public class FacebookApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "fb-server");
        SpringApplication.run(FacebookApplication.class, args);
    }
}
