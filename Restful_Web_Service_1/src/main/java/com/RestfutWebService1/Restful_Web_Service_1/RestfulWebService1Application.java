package com.RestfutWebService1.Restful_Web_Service_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//		1Create a simple REST ful service in Spring Boot which returns the
//			Response "Welcome to spring boot".  Ans-> Refer welcome.java

//		2.Create an Employee Bean(id, name, age) and service to  perform different operations.
//			related to employee.	Ans-> Refer Employee.java

//		3.Implement GET http request for Employee to get list of employees.
//									Ans-> Refer UserResource.java
//		4.Implement GET http request using path variable top get one employee.
//									Ans-> Refer UserResource.java
//		5.Implement POST http request for Employee to create a new employee.
//									Ans-> Refer UserResource.java
//		6.Implement Exception Handling for resource not found.
//									Ans-> Refer UserNotFoundException.java
//		7.Implement DELETE http request for Employee to delete employee.
//									Ans-> Refer UserResource.java
//		8.Implement PUT http request for Employee to update employee.
//									Ans-> Refer UserResource.java
//		9.Apply validation while create a new employee using POST http Request.
//									Ans-> Refer UserResource.java
//		10.Configure actuator in your project to check the health of application and get
//			the information about various beans configured in your application.

@SpringBootApplication
public class RestfulWebService1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebService1Application.class, args);
	}
}
