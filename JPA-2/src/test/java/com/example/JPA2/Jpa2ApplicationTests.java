package com.example.JPA2;

import com.example.JPA2.entity.Check;
import com.example.JPA2.entity.CreditCard;
import com.example.JPA2.entity.Employee;
import com.example.JPA2.repository.EmployeeRepository;
import com.example.JPA2.repository.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Jpa2ApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PaymentRepository repository;
    @Test
    void contextLoads() {

    }

    @Test
    void testCountRecords(){
        System.out.println(employeeRepository.countrecords());
    }
    @Test
    public void testCreate() {
        Employee emp = new Employee();
        emp.setAge(32);
        emp.setId(3223);
        emp.setFirstName("tarun");
        emp.setLastName("singh");
        emp.setSalary(0);
        employeeRepository.save(emp);
    }

    //	@Test
//	public void readEmployee(){
//		employeeRepository.findAll().forEach(e->System.out.println(e.getFirstName()));
//	}
    @Test
    public void testfilterBySalary() {
        List<Object[]> partialData = employeeRepository.filterBySalary();
        for (Object[] objects : partialData) {
            System.out.println(objects[0]+" "+objects[1]);

        }
    }
//    @Test
//    public void testUpdateSalary(){
//        Integer a=employeeRepository.updateSalary(9500);
//        System.out.println("no of affected rows:"+a);
//    }

    @Test
    public void testFilterByLastnName(){
        List<Object[]> data=employeeRepository.filterByLastName();
        for(Object[] objects:data){
            System.out.println(objects[0]+ " "+objects[1]+" "+objects[2]);
        }
    }

//    @Test
//    public void testDeleteMinSalary(){
//        employeeRepository.deleteMinSalaryEmployees();
//    }
@Test
public void createPayment() {
    CreditCard cc = new CreditCard();
    cc.setId(123);
    cc.setAmount(1000);
    cc.setCardnumber("1234567890");
    repository.save(cc);
}

    @Test
    public void createCheckPayment() {
        Check ch = new Check();
        ch.setId(124);
        ch.setAmount(1000);
        ch.setChecknumber("1234567890");
        repository.save(ch);
    }

  /*  @Test
    public void testCreate() {
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("Bharath");
        Address address = new Address();
        address.setCity("Austin");
        address.setStreetaddress("Spicewood Springs");
        address.setCountry("USA");
        address.setState("TEXAS");
        address.setZipcode("78750");
        employee.setAddress(address);

        repository.save(employee);
    }*/
}
