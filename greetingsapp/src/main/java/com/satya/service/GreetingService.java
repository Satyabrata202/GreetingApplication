package com.satya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class GreetingService implements IGreet{

    @Autowired
    private LocalDateTime dateTime;

    @Override
    public String generateGreeting(String name) {

        int hours = dateTime.getHour();

        if(hours < 12){
            return "Good Morning"+name;
        }
        else if (hours < 17 ){
            return "Good afternoon"+name;
        }
        else if (hours < 20 ){
            return "Good evening"+name;
        }
        else
            return "Good night"+name;

    }
}
