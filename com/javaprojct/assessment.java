package com.javaprojct;

import java.util.Scanner;

public class assessment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String studentname, ID, course;
        int examscore;


        System.out.println("Enter student name");
        studentname = input.nextLine();
        System.out.println("EnterID");
        ID = input.nextLine();

        System.out.println("Enter course");
        course = input.nextLine();

        System.out.println("Enter examscore");
        examscore = input.nextInt();

        if (examscore < 0 || examscore > 100) {
            System.out.println("invalid");

        } else if (examscore >= 80 && examscore <= 100) {
            System.out.println("A");
        } else if (examscore >= 70 && examscore <= 79) {
            System.out.println("B");

        } else if (examscore >= 60 && examscore <= 69) {
            System.out.println("C");

        } else if (examscore >= 50 && examscore <= 59) {
            System.out.println("D");

        } else {
            System.out.println("F");
        }
        // display output
    }
}