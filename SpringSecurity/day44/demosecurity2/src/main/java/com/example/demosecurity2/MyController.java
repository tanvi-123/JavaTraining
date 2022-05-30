package com.example.demosecurity2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/")
public String home() {
	String s1="<h1> Hello World</h1>"; 
	return s1;
}
}
