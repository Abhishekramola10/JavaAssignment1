package com.Spring_With_Jpa_1.Spring_With_Jpa_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class SpringWithJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithJpa1Application.class, args);
		System.out.println("hi");
		}
	}


