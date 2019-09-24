package com.lambton;

import java.time.LocalDate;

public class FullTimeFaculty extends Faculty{
    private float bonus;
    private float totalSalary;


    public FullTimeFaculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specialization, float bonus) {
        super(id, firstName, lastName, birthDate, gender, designation, salary, specialization);
        this.bonus = bonus;
    }



    public void display()
    {
        super.display();
        System.out.println("Faculty Status is Full Time");
        System.out.println("Faculty Bonus is " + this.bonus);
        System.out.println("Faculty Total Salary is " + calculateTotalSalary());

    }

    @Override
    public float calculateTotalSalary() {
        totalSalary = this.getSalary() + bonus;
        return totalSalary;

    }
}
