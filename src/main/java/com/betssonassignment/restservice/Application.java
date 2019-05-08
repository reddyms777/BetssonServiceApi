package com.betssonassignment.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"/mysql-rest-service/src/main/java/com/betssonassignment/restservice/repository/CreateUser.java"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
     
    }
}
