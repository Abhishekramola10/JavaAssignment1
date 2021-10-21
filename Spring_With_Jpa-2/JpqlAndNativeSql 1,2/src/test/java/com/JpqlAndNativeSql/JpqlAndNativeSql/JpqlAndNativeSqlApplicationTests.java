package com.JpqlAndNativeSql.JpqlAndNativeSql;

import com.JpqlAndNativeSql.JpqlAndNativeSql.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class JpqlAndNativeSqlApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	public void testEmployeeCreate() {
		Employee employee = new Employee();
		employee.setFirstName("Abhishek");
		employee.setLastName("Ramola");
		employee.setAge(23);
		employee.setSalary(33000);

		repository.save(employee);
	}

	@Test
	public void testFindAllEmployees() {	//Returns all employees
		System.out.println(repository.findAllEmployees());
	}

	@Test
	public void testFindAllEmployeesPartialData(){					//JPQL 1
		List<Object[]> partialData = repository.findAllEmployeesPartialData(45);
		for(Object[] objects : partialData){
			System.out.println(objects[0]);	//first name
			System.out.println(objects[1]);	//last name
		}
	}

	@Test
	public void testFindAllEmployeesByFirstName() {	//Returns all employees with firstname Abhishek
		System.out.println(repository.findAllEmployeesByFirstName("Abhishek"));
	}

	@Test
	public void testFindAllEmployeesForGivenSalary() {	//Returns all employees with salary<average salary
		System.out.println(repository.findAllEmployeesforGivenSalary(50000));
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteEmployeesByFirstName(){
		repository.deleteEmployeesByFirstName("Abhishek");
	}

	@Test
	@Transactional														//JPQL- 3
	@Rollback(false)
	public void testDeleteEmployeesWithMinimumSalary(){
		repository.deleteEmployeesWithMinimumSalary(25000);
	}

	@Test
	public void testFindAllEmployeesNQ(){								//NQ - 2
		System.out.println(repository.findAllEmployeesNQ());
	}

	@Test
	public void testFindByFirstNameNQ(){								//NQ - 1
		System.out.println(repository.findByFirstNameNQ());
	}
}
