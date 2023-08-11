package com.sprintech.studentdatabasapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = null;
    private String studentID;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000; // value belongs to the class, its true for all objects

    // Constructor prompts user to enter student's name and year
    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student FirstName: ");
        this.firstName = input.nextLine();

        System.out.println("Enter Student LastName: ");
        this.lastName = input.nextLine();

        System.out.println("1- Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class level: ");
        this.gradeYear = input.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enrollToCourse(){
        //Get inside the loop, user hits 0
        do{
            System.out.print("Enter course to enroll(Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals( "Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;           
            }else{
                break;
            }
        }while(1 !=0);
         System.out.println("Enrolled in: " + courses);
         System.out.println("Tuition Balance: " + tuitionBalance);

         
    }

    // View Balance
    public void viewBalance(){
        System.out.println("Your balance is: KES." + tuitionBalance);
    }

    // Pay tution

    // show status
}
