package com.RestfutWebService1.Restful_Web_Service_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    //Question 3
    @GetMapping("/users")
    public List<Employee> retrieveAllUsers()
    {
        return service.findAll();
    }

    //Question 4
    @GetMapping("/users/{id}")
    public Employee retrieveUser(@PathVariable int id){
        Employee employee = service.findOne(id);
        if(employee ==null)
            throw new UserNotFoundException("id-"+ id);         //for ques.6
        return service.findOne(id);
    }

    //Question 5
    @PostMapping("/users")  // to run post request, we need a simple rest clien(postman)
    public void createUser(@RequestBody Employee employee){
        Employee savedEmployee = service.save(employee);
    }

    //Question 7
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        Employee employee = service.deleteById(id);
        if(employee ==null)
            throw new UserNotFoundException("id-"+ id);         //for ques.6
    }

    //Question 8(Put)
    @PutMapping("/users/{id}")
    public Employee PutNewUser(@PathVariable int id, @RequestBody Employee employee){
        Employee employee2 = service.findOne(id);

        if(employee2 ==null)
            throw new UserNotFoundException("id-"+ id);
        else
        {
            service.deleteById(employee2.getId());
            service.save(employee);
            return employee;
        }
    }

    //Question 9(Validation)
    @PostMapping("/users2")
    public ResponseEntity<Object> createUser2(@Valid @RequestBody Employee employee)
    {
        Employee savedEmployee = service.save(employee);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
}
