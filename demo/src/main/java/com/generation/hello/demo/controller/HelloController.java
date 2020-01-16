package com.generation.hello.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	@ResponseBody
	public String primeiraPag() {
		return "Primeira pagina";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World ";
	}
	
	
	@GetMapping("/hello/{id}")
	@ResponseBody
	public String sayHello(@PathVariable Integer id) {
		return "Hello World " + id;
	}

}
