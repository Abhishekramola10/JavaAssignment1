package com.ComponentMapping.ComponentMapping;

import com.ComponentMapping.ComponentMapping.entities.Address;
import com.ComponentMapping.ComponentMapping.entities.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentMappingApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate(){
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Abhishek");
		Address address = new Address();
		address.setStreetaddress("Rajeevnagar");
		address.setCity("Dehradun");
		address.setState("Uttarakhand");
		address.setZipcode("248001");
		address.setCountry("India");
		employee.setAddress(address);

		repository.save(employee);
	}
}
