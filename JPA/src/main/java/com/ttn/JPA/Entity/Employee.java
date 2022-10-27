package com.ttn.JPA.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//create table employee(
//        name varchar(20),
//        id int PRIMARY KEY,
//        age int,
//        location varchar(30)
//        );

@Entity
@Table(name="employee")
public class Employee {

private String name;
@Id
private int id;
private int age;
private String location;

    public Employee(String name, int id, int age, String location) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.location = location;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

