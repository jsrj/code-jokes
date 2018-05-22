package com.arjaycodes.codejokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.arjaycodes.codejokes.service"})
public class CodejokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodejokesApplication.class, args);
	}
}
