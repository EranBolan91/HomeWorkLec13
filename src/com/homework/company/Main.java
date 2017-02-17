package com.homework.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> phoneBook = new ArrayList<>();
        StudentPhoneBook student = new StudentPhoneBook();
        int userChoice = 0;
        Scanner scan = new Scanner(System.in);

        while(userChoice != 6){
            System.out.println("**Student phone book**");
            System.out.println("1)Add a student"+ "\n"+
                    "2)Remove a student by index"+ "\n"+
                    "3)Remove a student by name"+ "\n"+
                    "4)Show all contacts"+"\n"+
                    "5)Show contact by index"+"\n"+
                    "6)Exit");

            userChoice = scan.nextInt();

            switch (userChoice){

                case 1:
                    student.addStudent();
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Please enter the index of the student to delete ");
                    int index = scan.nextInt();
                    student.removeStudent(index);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Please enter the name of the student to delete ");
                    String name = scan.next();
                    student.removeStudent(name);
                    System.out.println("*** CONTACT DELETED***");
                    System.out.println();
                    break;

                case 4:
                    student.showAllStudents();
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Please enter the index of the student to delete");
                    int stIndex = scan.nextInt();
                    student.showStudent(stIndex);
                    System.out.println("*** CONTACT DELETED***");
                    System.out.println();
                    break;

                case 6:
                    userChoice = 6;
                    System.out.println("***** GOOD BYE *****");
                    break;

            }

        }
    }
}
