package com.satya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Configuration1 {

    @Bean
    public LocalDateTime generateTime(){

        return LocalDateTime.now();
    }
}
