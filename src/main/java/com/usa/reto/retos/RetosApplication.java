package com.usa.reto.retos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = {"com.usa.reto.retos.model"})
@SpringBootApplication
public class RetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetosApplication.class, args);
	}

}
