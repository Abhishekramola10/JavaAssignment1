package com.Spring_With_Jpa_1.Spring_With_Jpa_1;

//for all the C.R.U.D functions
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Answer-2
//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {       //For questions 1-7
//}

//public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{}    //For ques. 8

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    List<Employee> findByFirstName(String FName);

   List<Employee> findByFirstNameLike(String str);

  List<Employee> findByAgeBetween(int a, int b);
}
