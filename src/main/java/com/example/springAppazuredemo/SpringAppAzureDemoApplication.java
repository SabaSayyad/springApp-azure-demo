package com.example.springAppazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringAppAzureDemoApplication {

	@GetMapping("/home")
	public String message() {
		return "Deployed";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAppAzureDemoApplication.class, args);
	}

}
