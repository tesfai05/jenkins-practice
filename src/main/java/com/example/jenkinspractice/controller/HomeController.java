package com.example.jenkinspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String displayData() {
		return "Welcome Jenkins";
	}
	
	@GetMapping("/users")
	public String displayUsers() {
		return "List of Users";
	}

}
