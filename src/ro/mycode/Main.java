package ro.mycode;

import ro.mycode.controller.StudentController;
import ro.mycode.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("Ana", "Marketing", 001, 5);
//        // Student s2=s1;
//        Student s3 = new Student("George", "Fabiz", 3, 6);
//        Student s4 = new Student("Paul", "Management", 4, 7);
//        Student s5 = new Student("Denisa", "CSIE", 5, 8);
//
//
//        Student a = s4;
//        s5 = s4;
//        s3 = s4;
//
//        System.out.println(s1.descriereStudent());
////        System.out.println(s2.descriereStudent());

        Student test= new Student("Paul", "Management", 4, 7);
        Student test2=test;


        Student c=ex(test);




    }

    //todo:functie ce prin apelarea ei putem exemplifica un memory leak

    public static Student ex(Student student){


        Student s4 = new Student("Paul", "Management", 4, 7);


        return student;


    }


}
