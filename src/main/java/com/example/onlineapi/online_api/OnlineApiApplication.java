package com.example.onlineapi.online_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/spring/online")
public class OnlineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineApiApplication.class, args);
	}

	@GetMapping("")
	public Object getMapping () {
		return "GET route";
	}

	@PostMapping("")
	public Object postMapping () {
		return "POST route";
	}

	@PutMapping("")
	public Object putMapping () {
		return "PUT route";
	}

	@DeleteMapping("")
	public Object delMapping () {
		return "DELETE route";
	}

}
