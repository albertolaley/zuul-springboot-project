package com.albertorosario.springboot_microservices.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CustomerserviceApplication.class, args);
  }

}