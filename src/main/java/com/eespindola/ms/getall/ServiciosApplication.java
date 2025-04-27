package com.eespindola.ms.getall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosApplication.class, args);
	}

}
