package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlller {
  
	@RequestMapping("/test")
	public String getHello() {

		return "hellomaster123456789a";
	}
}
