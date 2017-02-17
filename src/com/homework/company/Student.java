package com.homework.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by Bolandian on 17/02/2017.
 */
public class Student {

    //properties:
    String firstName;
    String lastName;
    String socialID;
    LocalDateTime enrollmentDate; //Shift + F6 (Rename
    String email;
    String phone;
    String address;

    //Constructor:
    // a special method that assists us in initializing all the properties:
    //alt + insert:
    public Student(String firstName, String lastName, String socialID, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.enrollmentDate = LocalDateTime.now();
    }

    //default constructor:
    //if no other constructor exists, the compiler generates
    //a default constructor like this one - for free:
    public Student(){
        System.out.println("Let's create a new Student: ");
        this.firstName = IO.getString("Enter Name: ");
        this.lastName = IO.getString("Enter Last Name: ");
        this.socialID = IO.getString("Enter Social ID: ");
        this.email =  IO.getString("Enter Email: ");
        this.phone = IO.getString("Enter Phone: ");
        this.address = IO.getString("Enter Home Address: ");
        this.enrollmentDate = LocalDateTime.now();
    }

    //Actions / Methods:
    //instance method:
    public void print(){
        System.out.println(toString());
    }

    public String toString() {
        return
                "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Social ID: " + socialID + "\n" +
                        "Enrollment Date: " + enrollmentDate + "\n" +
                        "Email address: " + email + "\n" +
                        "Home Address: " + address + "\n" +
                        "Phone: " + phone;
    }

    //instance method
    //first create an instance:, on the instance we call this method:"
    //Student s = new Student;
    //s.sayYourName();
    public void sayYourName(){
        System.out.println("Name: " + firstName + " - " + lastName);
    }

    public void howManySeconds(){
        LocalDateTime now = LocalDateTime.now();

        now.until(enrollmentDate, ChronoUnit.SECONDS);

        LocalDateTime birthDate = LocalDateTime.of(1980, 1, 1, 12, 0);


    }
}


