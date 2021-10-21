package com.ManyToMany.manyTomany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class ManyTomanyApplicationTests {

	@Autowired
	ProgrammerRepository programmerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testmtomCreateProgrammer(){
		Programmer programmer = new Programmer();
		programmer.setName("ayush");
		programmer.setSal(25000);
		HashSet<Project> projects = new HashSet<Project>();
		Project project = new Project();
		project.setName("hibernate Project");
		projects.add(project);
		programmer.setProjects(projects);

		programmerRepository.save(programmer);
	}
	//Answer 9-  Clear():
	// method on  session object which can be used to remove an object from the cache
}

//Answer 10-The @Transactional annotation makes use of the
// attributes rollbackFor or rollbackForClassName to rollback the transactions, and the
// attributes noRollbackFor or noRollbackForClassName to avoid rollback on listed exceptions.
