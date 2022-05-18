package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "demo2.com")
public class Springdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo1Application.class, args);
	}

}
