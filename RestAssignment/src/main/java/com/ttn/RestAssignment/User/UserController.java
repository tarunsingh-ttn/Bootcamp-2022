package com.ttn.RestAssignment.User;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "")
    @PostMapping("/add/user")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newUser=userService.saveUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK );
    }

    @GetMapping("/users")
    public MappingJacksonValue showUsers(){
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(userService.getAllUsers());

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("city");

        FilterProvider filters =
                new SimpleFilterProvider().addFilter("SomeBeanFilter", filter );

        mappingJacksonValue.setFilters(filters );

//        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
        return mappingJacksonValue;

    }

}
