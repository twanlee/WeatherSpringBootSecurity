package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.demo.service.AccountService;
import com.demo.service.impl.AccountServiceImpl;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WeatherforecastApplication {

//    @PostConstruct
//    public void createAccount() {
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(WeatherforecastApplication.class, args);
    }

}
