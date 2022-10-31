package com.example.JPA2.repository;

import com.example.JPA2.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    @Query("select firstName,lastName from Employee where salary > (select avg(salary) from Employee) ORDER BY age ASC, salary DESC")
//    @Query("select firstName,lastName from Employee where salary > AVG(salary)")
    List<Object[]> filterBySalary();

    @Query("SELECT AVG(salary) FROM Employee")
    Integer countrecords();
    //Update salary of all employees by a salary passed
    // as a parameter whose existing salary is less than the average salary.

    @Modifying
    @Transactional
    @Query("Update Employee e SET salary=:newSalary where e.salary > (Select AVG(salary) from e)")
    Integer updateSalary(@Param("newSalary") int newSalary);
//
    @Modifying
    @Transactional
    @Query(value = "delete from employee_table where emp_salary=",nativeQuery = true)
    void deleteMinSalaryEmployees();

    //Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value="Select emp_id,emp_first_name,emp_age from employee_table where emp_last_name = 'SINGH' ",nativeQuery = true)
    List<Object[]> filterByLastName();
}
