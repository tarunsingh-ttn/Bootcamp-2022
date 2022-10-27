package com.ttn.RestAssignment.Versioning;

public class StudentV2 {
    private String name;
    private int rollNo;
    private String city;
    private String grade;

    public StudentV2(String name, int rollNo, String city, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.city = city;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
