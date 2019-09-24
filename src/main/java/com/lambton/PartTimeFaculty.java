package com.lambton;

import java.time.LocalDate;

public class PartTimeFaculty extends Faculty {

    private float wagesHourly;
    private int extraHours;
    private float totalSalary;


    public PartTimeFaculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specialization, float wagesHourly, int extraHours) {
        super(id, firstName, lastName, birthDate, gender, designation, salary, specialization);
        this.wagesHourly = wagesHourly;
        this.extraHours = extraHours;
    }


    @Override
    public float calculateTotalSalary() {
        totalSalary=this.getSalary()+wagesHourly*extraHours;
        return totalSalary;
    }

    public void display()
    {
        super.display();
        System.out.println("Faculty status is part Time ");
        System.out.println("Faculty Hourly Wages are " + this.wagesHourly);
        System.out.println("Faculty Extra Hours are " + this.extraHours);
        System.out.println("Faculty Total Salary is " + calculateTotalSalary());

    }
}
