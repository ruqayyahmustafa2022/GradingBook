package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Grading Book
        Write a program that evaluates a student’s numeric grade (0-100) to determine the student’s letter grade
        (A, B, C, D, or F)
        If the student’s grade is less than 60, the program should not evaluate the grade and should print, “You failed.”

        If the student’s grade is greater than 60, the program should evaluate on the following scale and print,
        “You got a(n) [letter grade]!”

        A: 90-100, B: 80-89, C: 70-79, D: 60-69
        */

        //declare the variable for the student's grade
        double studentGrade;

        //Ask for the student's grade and let the user provide the input
        Scanner gradeInput = new Scanner(System.in);
        System.out.println("Enter the student's grade:");
        studentGrade = gradeInput.nextDouble();

        //Evaluate the Grade
        //if less than 60, print "You Failed"
        if (studentGrade < 60)
            System.out.println("You failed.");
            //D for 60-69
        else if (studentGrade >= 60 && studentGrade <= 69)
            System.out.println("You got D!");
            //C for 70-79
        else if (studentGrade >= 70 && studentGrade <= 79)
            System.out.println("You got a C!");
            //B for 80 to 89
        else if (studentGrade >= 80 && studentGrade <= 89)
            System.out.println("You got a B!");
            //A for 90 to 100
        else if (studentGrade >= 90 && studentGrade <= 100)
            System.out.println("You got an A!");
        else
            System.out.println("Invalid Input");

    }

}
