package com.example.configclientvehicleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(basePackages = "com.richa.microserviceDemo.commons")
@EnableResourceServer
public class ConfigclientVehicleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientVehicleServiceApplication.class, args);
    }

}
