package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

//Questions:
//(2)Write a program to demonstrate Loosely Coupled code.
//(3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
//(4) Get a Spring Bean from application context and display its properties.
//(5) Demonstrate how you will resolve ambiguity while autowiring bean (Hint : @Primary)
//(6) Perform Constructor Injection in a Spring Bean

//Refer QuickSortAlgorithm for Ques 3 and 5

@SpringBootApplication
public class SpringIn5StepsApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private Ci demo;

	public static void main(String[] args) {

		SpringApplication.run(SpringIn5StepsApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {	//Ques. 4
			BinarySearchImpl obj = (BinarySearchImpl) applicationContext.getBean("binarySearchImpl");
			obj.binarySearch(new int[]{1, 2, 3}, 2);

			System.out.println(demo);
	}

	@Bean
	public Ci newBean(){
		return new Ci("Hey", 23);
	}		//Ques 6
}
