package com.ttn.RestAssignment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private static List<Employee> emps=new ArrayList<>();
    static {
        emps.add(new Employee(101,"joice",420));
        emps.add(new Employee(201,"ayush",690));
        emps.add(new Employee(301,"tarun",320));
        //emps.add(new Employee("abhishek","garg@6969"));


    }

    //getAllEmps
    List<Employee> findAllEmployees(){

        return emps;
    }
    //GetEmp using id
    Employee findEmployee(int id) throws ResourceNotFoundException {
        Optional<Employee> optional=emps.stream().filter((emp)->emp.getId()==id).findFirst();
        Employee emp =optional.orElseThrow(()->new ResourceNotFoundException("Employee not found"));

        return emp;
    }


    public Integer addEmployee(Employee emp) {
        emps.add(emp);
        return emp.getId();
    }

    public String removeEmployee(Integer id) {
       Optional<Employee> optional= emps.stream().filter((e)->e.getId()==id).findFirst();
       String message="";
        if(emps.remove(optional.get())){
             message="Successfully deleted";
        }else{
            message="not found";
        }
          return message;
    }

    public String updateEmployee(Integer id, Employee emp) {
        String message="";
        Optional<Employee> optional=emps.stream().filter(e->e.getId()==id).findFirst();
        if (optional.isPresent()){
           Employee tempEmp= optional.get();
           tempEmp.setId(emp.getId());
           tempEmp.setAge(emp.getAge());
           tempEmp.setName(emp.getName());
           message="employee updated";
        }else{
            message="no employee with this id exists!!!!";
        }

        return message;
    }
}
