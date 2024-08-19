package com.firstapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {
		System.out.println("hELLO World");
		SpringApplication.run(FirstappApplication.class, args);
	}

}
