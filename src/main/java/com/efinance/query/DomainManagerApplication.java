package com.efinance.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class DomainManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainManagerApplication.class, args);
	}
	

}
