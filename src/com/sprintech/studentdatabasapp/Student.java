package com.sprintech.studentdatabasapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses;
    private int studentID;   
    private int tuitionBalance;
    private int costOfCourse=600;

    //Constructor prompts user to enter student's name and year
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student FirstName: ");
        this.firstName = input.nextLine();

        System.out.println("Enter Student LastName: ");
        this.lastName = input.nextLine();

        System.out.println("1- Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class level: ");
        this.gradeYear=input.nextInt();

        System.out.println( firstName + " " + lastName + " " + gradeYear);


    }

    //Generate an ID


    //Enroll in courses

    //View Balance
    //Pay tution

    //show status
}
