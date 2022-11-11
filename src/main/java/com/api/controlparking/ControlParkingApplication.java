package com.api.controlparking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControlParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlParkingApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "Minha API Rest com Spring boot";
	}
}
