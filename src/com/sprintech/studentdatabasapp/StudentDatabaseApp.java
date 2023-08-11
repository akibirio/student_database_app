package com.sprintech.studentdatabasapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
       
        //Ask How many new students we want to add
        System.out.print("Enter Number of New Students to Enroll: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        Student[] students = new Student[numberOfStudents];

        //create n number of students
        for(int n =0; n<numberOfStudents; n++){
             students[n] = new Student();
             students[n].enrollToCourse();
             students[n].payTuition();
            //     System.out.println();
            //     System.out.println("=============================");
            //     System.out.println("Students Registered");
            //     System.out.println("=============================");
            // System.out.println( students[n].showInfo());
            // System.out.println("=============================");
        }

        System.out.println();
        System.out.println("Priting Students ....");
        System.out.println("=============================");
        System.out.println("Students Registered");
        System.out.println("=============================");
        for(int i =0; i< students.length; i++){
             
            System.out.println( students[i].showInfo());
            System.out.println("=============================");

        }
        
    }
    
}
