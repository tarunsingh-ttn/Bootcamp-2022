package com.ttn.JPA.Repository;

import com.ttn.JPA.Entity.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface  EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {

        List<Employee> findByName(String name);
        List<Employee> findByNameLike(String pattern);
        List<Employee> findByAgeBetween(int StartAge,int EndDate);

}
