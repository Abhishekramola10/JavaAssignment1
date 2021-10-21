package com.ComponentMapping.ComponentMapping;

import com.ComponentMapping.ComponentMapping.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository  extends CrudRepository<Employee, Integer> {

}
