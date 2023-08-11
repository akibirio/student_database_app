package com.sprintech.studentdatabasapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses;
    private String studentID;   
    private int tuitionBalance;
    private static int costOfCourse=600;
    private static int id = 1000;  //value belongs to the class, its true for all objects

    //Constructor prompts user to enter student's name and year
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student FirstName: ");
        this.firstName = input.nextLine();

        System.out.println("Enter Student LastName: ");
        this.lastName = input.nextLine();

        System.out.println("1- Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class level: ");
        this.gradeYear=input.nextInt();
         setStudentID();
        System.out.println( firstName + " " + lastName + " " + gradeYear + " "+ studentID);
       
        input.close();
    }

    //Generate an ID
    private void setStudentID(){
        //Grade Level + ID
         id++;
        this.studentID =  gradeYear + "" + id;

    }

    //Enroll in courses

    //View Balance
    //Pay tution

    //show status
}
