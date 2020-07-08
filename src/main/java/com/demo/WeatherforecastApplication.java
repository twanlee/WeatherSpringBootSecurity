package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.demo.service.AccountService;
import com.demo.service.impl.AccountServiceImpl;

@SpringBootApplication
public class WeatherforecastApplication {
     @Bean
     public AccountService accountService(){
         return new AccountServiceImpl();
     }
    public static void main(String[] args) {
       SpringApplication.run(WeatherforecastApplication.class, args);
    }

}
