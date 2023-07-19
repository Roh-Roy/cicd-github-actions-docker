package com.example.cicdgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdGithubActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdGithubActionsApplication.class, args);
	}

	@GetMapping("/hello")
	public String welcome(){
		return "Hello World!";
	}
}
