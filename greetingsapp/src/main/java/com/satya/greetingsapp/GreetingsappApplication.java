package com.satya.greetingsapp;

import com.satya.service.GreetingService;
import com.satya.service.IGreet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.satya")
public class GreetingsappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(GreetingsappApplication.class, args);
		IGreet greet =  container.getBean(GreetingService.class);

		System.out.println(greet.generateGreeting(" Satyabrata"));

	}

}
