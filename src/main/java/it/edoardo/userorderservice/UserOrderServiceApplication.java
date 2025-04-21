package it.edoardo.userorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserOrderServiceApplication.class, args);
    }

}
