package com.aop.Assignment2.models;

import org.springframework.stereotype.Component;

@Component 
public class Student {

    private int employeeCode = 644;
    private String name = "Srinivasa Sameer";

    public void getName() {
        System.out.println("Hello! I am " + this.name);
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public int getPercentage(int m1, int m2) {
        return (( m1 + m2 ) / 2);
    }
    
    public void getCourse(String course) {
        System.out.println("Course = " + course);
        throw new RuntimeException();
    }

}