package com.example.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HelloDevController {
	@GetMapping("/dev")
	public String HelloDev() {
		
		return "hello_dev";
	}
	
}
