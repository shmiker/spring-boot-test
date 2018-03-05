package com.example.springdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
public class SpringDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
}
