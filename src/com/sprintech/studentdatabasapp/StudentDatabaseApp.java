package com.sprintech.studentdatabasapp;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.enrollToCourse();
        student.payTuition();
       System.out.println( student.showInfo());
        //Ask How many users we want to add

        //create n number of students
    }
    
}
