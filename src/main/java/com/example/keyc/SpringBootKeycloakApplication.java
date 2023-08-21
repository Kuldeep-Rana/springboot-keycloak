package com.example.keyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKeycloakApplication.class, args);
	}

}
