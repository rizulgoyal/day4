package com.lambton;

import java.time.LocalDate;

public class MainExample {

    public static void main(String[] args) {
        Person p1;

        Student s1 = new Student(1,
                "rizul",
                "goyal",
                LocalDate.now(),
                "Male",
                "MADT",
                2);

        p1=s1;
        p1.display();

        Faculty f1;
        f1 = new Faculty(2,
                "Pritesh",
                "Patel",
                LocalDate.now(),
                "Male",
                "Associate Professor",
                (float) 5842.50,
                "Coding"

                );

        p1=f1;
        f1.display();


    }


    }

