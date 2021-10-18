package com.RestfutWebService1.Restful_Web_Service_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Question 1
@RestController
public class welcome {
    @GetMapping(path = "/welcome")
    public String hello(){
        return "Welcome to Spring Boot";
    }
}
