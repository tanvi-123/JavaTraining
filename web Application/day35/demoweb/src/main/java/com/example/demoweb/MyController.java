package com.example.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello from String Boot";
	}
	
	@GetMapping("/hello")
	public String getmsg() {
		return "Hello World";
	}
}
