package com.ttn.RestAssignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //get
    @GetMapping("/getAllEmp")
    public ResponseEntity<List<Employee>> getALlEmployees() {
        List<Employee> allEmps = (List<Employee>) employeeService.findAllEmployees();
        return new ResponseEntity<>(allEmps, HttpStatus.OK);
    }


    @GetMapping("/getEmp/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Integer id) throws ResourceNotFoundException {
        Employee emp = employeeService.findEmployee(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @PostMapping("/addEmp")
    public ResponseEntity<String> addEmployee(@Valid @RequestBody  Employee emp) throws Exception {
        Integer id = employeeService.addEmployee(emp);
        return new ResponseEntity<>("Employee created with id "+id,HttpStatus.CREATED);
    }

    @DeleteMapping("/emp/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
       String message= employeeService.removeEmployee(id);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @PutMapping("/updateEmp/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Integer id,@RequestBody Employee emp){
        String message=employeeService.updateEmployee(id,emp);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }



}
