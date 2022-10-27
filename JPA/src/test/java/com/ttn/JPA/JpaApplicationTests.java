package com.ttn.JPA;

import com.ttn.JPA.Entity.Employee;
import com.ttn.JPA.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class JpaApplicationTests {

	@Test
	void contextLoads() {

	}
	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	public void testCreate(){
		Employee emp=new Employee();
		emp.setAge(32);
		emp.setId(3223);
		emp.setName("ayush sharma");
		emp.setLocation("baghpath");
		employeeRepository.save(emp);

	}

	@Test
	public void testUpdate(){
		Employee employee=employeeRepository.findById(3223).get();
		employee.setAge(23);
		employeeRepository.save(employee);

	}

	@Test
	public void testRead() {
		Employee employee = employeeRepository.findById(3223).get();
		assertNotNull(employee);
		assertEquals("ayush sharma", employee.getName());
	}

	@Test
	public void testDelete() {
		if (employeeRepository.existsById(3223)) {
			System.out.println("Deleting a emp");
			employeeRepository.deleteById(1);
		}
	}

	@Test
	public void testCount() {
		System.out.println("Total Records" + employeeRepository.count());

	}

	@Test
	public void testFindAllPaging() {
		PageRequest pageable = PageRequest.of(0, 1);
		Iterable<Employee> results = employeeRepository.findAll(pageable);
		results.forEach(p -> System.out.println(p.getName()));

	}

	@Test
	public void testFindAllSorting() {
//		repository.findAll(Sort.by(new Sort.Order(Direction.DESC, "name"), new Sort.Order(null, "price")))
//				.forEach(p -> System.out.println(p.getName()));

		 employeeRepository.findAll(Sort.by("age")).forEach(p ->
		 System.out.println(p.getName()));

	}
	@Test
	public void testFindByName() {
		List<Employee> emps = employeeRepository.findByName("ayush sharma");
		emps.forEach(e -> System.out.println(e.getName()));


	}
	@Test
	public void testFindByNameLike(){
		List<Employee> emps=employeeRepository.findByNameLike("a%");
		emps.forEach(e -> System.out.println(e.getName()));
	}

	@Test
	public void testFindByAgeBetween(){
		List<Employee> emps=employeeRepository.findByAgeBetween(28,32);
		emps.forEach(e -> System.out.println(e.getName()));
	}


}
