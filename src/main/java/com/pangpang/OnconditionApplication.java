package com.pangpang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OnconditionApplication {

	@Autowired
	private Hello hello;

	@RequestMapping("/index")
	public String hello(){
		return hello.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(OnconditionApplication.class, args);
	}
}
