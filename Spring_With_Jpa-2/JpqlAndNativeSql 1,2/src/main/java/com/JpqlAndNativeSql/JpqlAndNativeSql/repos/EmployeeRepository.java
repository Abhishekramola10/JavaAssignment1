package com.JpqlAndNativeSql.JpqlAndNativeSql.repos;

import com.JpqlAndNativeSql.JpqlAndNativeSql.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    //return all employees
    @Query("from Employee")
    List<Employee> findAllEmployees();

                                                                             //       Answer-1 return first and last name
    @Query("select st.firstName,st.lastName from Employee st where st.salary>:Avg_Salary ORDER BY st.age ASC, st.salary DESC")
    //st-> alias/reference to object
    List<Object[]> findAllEmployeesPartialData(@Param("Avg_Salary")int Avg_Sal);

    //return list of employees with same first name
    @Query("from Employee where firstName=:firstName")
    List<Employee> findAllEmployeesByFirstName(@Param("firstName")String firstName);

    //return employee with salary<average salary
    @Query(" Employee where salary<:avg")                                                  //Answer-2 JPQL
    List<Employee> findAllEmployeesforGivenSalary(@Param("avg")int avg);

    @Modifying
    @Query("delete from Employee where firstName = :FName")
    void deleteEmployeesByFirstName(@Param("FName")String firstName);

    @Modifying
    @Query("delete from Employee where salary = :MinSalary")
    void deleteEmployeesWithMinimumSalary(@Param("MinSalary")int MinSalary);                  //Answer-3 JPQL

    //retrieve students by first name using native query
    @Query(value ="SELECT id,fname,age FROM EMPLOYEE WHERE lname LIKE '%singh'",nativeQuery=true)//answer-1 NATIVE_QUERY
    List<Employee> findByFirstNameNQ();

    @Modifying
    @Query(value ="DELETE from employee WHERE age >45", nativeQuery = true)                     //answer-2 NATIVE_QUERY
    List<Employee> findAllEmployeesNQ();
}
