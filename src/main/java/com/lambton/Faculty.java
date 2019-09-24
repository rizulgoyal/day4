package com.lambton;

import java.time.LocalDate;

public abstract class Faculty extends Person{

    private String designation;
    private float salary;
    private String specialization;


    public Faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specialization) {
        super(id, firstName, lastName, birthDate, gender);
        this.designation = designation;
        this.salary = salary;
        this.specialization = specialization;
    }



    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void display() {

        System.out.println("Faculty ID: "+ getId());
        System.out.println("Faculty First Name : "+ getFirstName());
        System.out.println("Faculty Last Name : "+ getLastName());
        System.out.println("Faculty Birth Date : "+ getBirthDate());
        System.out.println("Faculty Gender : "+ getGender());
        System.out.println("Faculty First Name : "+ getFirstName());
        System.out.println("Faculty  Designation : "+ this.getDesignation());
        System.out.println("Faculty Salary : "+ this.getSalary());
        System.out.println("Faculty Specialization: "+ this.getSpecialization());

    }

    public abstract float calculateTotalSalary();

}
