package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootWebMvcThymeleafExApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcThymeleafExApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(SpringBootWebMvcThymeleafExApplication.class);
	}

}
