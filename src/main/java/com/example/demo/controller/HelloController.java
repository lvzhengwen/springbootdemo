package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("==========");
		return "Hi, spring boot";   //http://localhost:8080/hello/
	}
	
	@RequestMapping("/echo")
	public String echo(String msg) {   //http://localhost:8080/hello/echo?msg=1
		return "[echo]:" + msg;
	}
	
	@RequestMapping(value="/rest/{message}", method=RequestMethod.GET)
	public String restInfo(@PathVariable("message") String msg) {
		return "rest:" + msg;   //http://localhost:8080/hello/rest/90
	}

}
