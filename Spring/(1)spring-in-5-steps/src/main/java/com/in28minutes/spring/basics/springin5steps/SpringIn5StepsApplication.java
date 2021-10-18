package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl();
		binarySearch.binarySearch(new int[] {12,3,4}, 3);

		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}
}
