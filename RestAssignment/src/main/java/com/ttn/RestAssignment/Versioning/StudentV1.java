package com.ttn.RestAssignment.Versioning;

public class StudentV1 {
    private String name;
    private int rollNo;

    public StudentV1(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
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

    @Override
    public String toString() {
        return "StudentV1{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
