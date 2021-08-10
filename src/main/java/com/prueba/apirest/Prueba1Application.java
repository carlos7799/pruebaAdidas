package com.prueba.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.prueba")
@EnableJpaRepositories(basePackages ="com.prueba.repository")
@EntityScan(basePackages = "com.prueba.entity")
public class Prueba1Application {

	public static void main(String[] args) {
		SpringApplication.run(Prueba1Application.class, args);
	}

}
