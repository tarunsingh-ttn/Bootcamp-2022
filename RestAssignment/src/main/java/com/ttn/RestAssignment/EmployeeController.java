package com.ttn.RestAssignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@RestController
public class EmployeeController {

    @Autowired
    private MessageSource messageSource;

//    public EmployeeController(MessageSource messageSource){
//        this.messageSource=messageSource;
//    }

    @Autowired
    EmployeeService employeeService;

    //get
    @GetMapping("/emp/all")
    public ResponseEntity<List<Employee>> getALlEmployees() {
        List<Employee> allEmps = (List<Employee>) employeeService.findAllEmployees();
        return new ResponseEntity<>(allEmps, HttpStatus.OK);
    }


    @GetMapping("/emp/{id}")
    public ResponseEntity<Employee> findById(@PathVariable Integer id) throws ResourceNotFoundException {
        Employee emp = employeeService.findEmployee(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }
    @PostMapping("/emp/add")
    public ResponseEntity<String> addEmployee( @RequestBody  Employee emp) {
        System.out.println(emp);
        Integer id = employeeService.addEmployee(emp);
        return new ResponseEntity<>("Employee created with id "+id,HttpStatus.CREATED);
    }

    @DeleteMapping("/emp/remove/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
       String message= employeeService.removeEmployee(id);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @PutMapping("/emp/updateEmp/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable Integer id,@RequestBody Employee emp){
        String message=employeeService.updateEmployee(id,emp);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }


    @GetMapping(path="/hello")
    public String hellowWorld(){
        return "hello world";
    }

    @GetMapping(path="/hello-i8n")
    public String hellowWorldInternationalized(@RequestParam String name){
        Locale locale= LocaleContextHolder.getLocale();
        
        return messageSource.getMessage("greeting.message", null, "Default Message", locale )+name;
    }



}
