package com.Spring_With_Jpa_1.Spring_With_Jpa_1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class SpringWithJpa1ApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	void Test(){

	}
	@Test
	public void TestEmployeeCreate(){		//Answer-3
		Employee employee = new Employee(12L,"Abhishek","Ramola",23,"Dehradun");
		repository.save(employee);
	}

	@Test
	public void TestUpdate(){				//Answer-4
		Employee pro = repository.findById(12L).get();
		pro.setId(10L);
		repository.save(pro);
	}

	@Test
	public void TestDelete(){				//Answer-5
		repository.deleteById(12L);
	}

	@Test
	public void TestRead(){				//Answer-6
		Employee pro = repository.findById(12L).get();
		assertNotNull(pro);	//pro should not be null
		assertEquals("Abhishek",pro.getFirstName());
		System.out.println(pro.getFirstName());
	}

	@Test
	public void TestCount(){				//Answer-7
		System.out.println(repository.count());
	}

	/*@Test
	public void testFindAllPagingAndSorting(){				//Answer-8(use Paging and Sorting Repository)
		PageRequest pageable = PageRequest.of(0,2, Sort.Direction.DESC, "age");	//(page no,no of records per page)
		repository.findAll(pageable).forEach(p-> System.out.println(p.getFirstName()));
	}*/

	@Test
	public void testFindByFirstName() {                //Answer-9
		List<Employee> employee = repository.findByFirstName("Amitabh");
		employee.forEach(p-> System.out.println(p.getFirstName()));
	}

	@Test
	public void testFindByLike() {                //Answer-10
		List<Employee> employee = repository.findByFirstNameLike("A%");
		employee.forEach(p-> System.out.println(p.getFirstName()));
	}

	@Test
	public void testFindBetweenAges() {                //Answer-11
		List<Employee> employee = repository.findByAgeBetween(28,32);
		employee.forEach(p-> System.out.println(p.getFirstName()));
	}
}
