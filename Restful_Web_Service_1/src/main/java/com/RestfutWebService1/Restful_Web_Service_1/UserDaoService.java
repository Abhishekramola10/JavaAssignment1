package com.RestfutWebService1.Restful_Web_Service_1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//class to contact to database
@Component
public class UserDaoService {
    private static final List<Employee> EMPLOYEES = new ArrayList<>();

    private static int usersCount = 3;

    static {
        EMPLOYEES.add(new Employee(1, "Abhishek", new Date()));
        EMPLOYEES.add(new Employee(2, "Ayush", new Date()));
        EMPLOYEES.add(new Employee(3, "Khusu", new Date()));
    }

    public List<Employee> findAll() {
        return EMPLOYEES;
    }

    public Employee save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(++usersCount);
        }
        EMPLOYEES.add(employee);
        return employee;
    }

    public Employee findOne(int id) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getId() == id)
                return employee;
        }
        return null;    //user not found
    }

    public Employee deleteById(int id) {        //Question 7
        Iterator<Employee> iterator = EMPLOYEES.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return employee;
            }
        }
        return null;    //user not found
    }
}
