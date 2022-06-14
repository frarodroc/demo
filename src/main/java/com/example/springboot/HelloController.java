package com.example.springboot;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HelloController {

	@Value("${USERNAME}")
	private String username;

	@GetMapping("/")
	public String index() {
		return "My username is: " + username;
	}

}
