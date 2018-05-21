package com.arjaycodes.codejokes;

import com.arjaycodes.codejokes.bootstrap.DevBootstrap;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodejokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodejokesApplication.class, args);
	}
}
