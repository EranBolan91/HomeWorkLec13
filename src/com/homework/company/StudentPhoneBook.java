package com.homework.company;

import java.util.ArrayList;

/**
 * Created by Bolandian on 17/02/2017.
 */
public class StudentPhoneBook {

    //init the list:
    ArrayList<Student> studentList = new ArrayList<>();

    void addStudent(Student s){

        studentList.add(s);
    }

    void addStudent(){
        Student s = new Student();//IO!!!
        studentList.add(s);
    }

    void removeStudent(int index){
        //TODO: Test for bounds:
        if(!(index > studentList.size() && index < 0))
        studentList.remove(index);
    }

    void removeStudent(String name){
        for (int i = 0; i < studentList.size() ; i++) {
            Student s = studentList.get(i);
            if(s.firstName.equals(name))
                removeStudent(i);
            else
                System.out.println("Name is not exists");
            System.out.println();
        }
    }

    void showStudent(int index){
        //TODO: Test for bounds:
        Student s = studentList.get(index);
        s.print();
    }

    void showAllStudents(){
        for (Student s : studentList) {
            s.print();
            System.out.println();
            System.out.println("___________________________________");
        }
    }
}



