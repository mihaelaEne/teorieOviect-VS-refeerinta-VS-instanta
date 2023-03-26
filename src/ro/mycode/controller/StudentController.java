package ro.mycode.controller;

import ro.mycode.model.Student;

import java.util.ArrayList;

public class StudentController {
    private ArrayList<Student> students;


    public StudentController(){
        this.students=new ArrayList<>();
        this.load();
    }

    public void load(){
        Student s1=new Student("Mihaela", "ASE",1,6.25f);
        Student s2=new Student("Daria", "Drept",2,8.2f);
        Student s3=new Student("Alex", "Marina",3,10);

        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public void afisareStudent(){
        for(int i=0; i<students.size(); i++){
            System.out.println(this.students.get(i).descriereStudent());
            System.out.println("\n");
        }
    }

public void addStudent(Student student){
        this.students.add(student);
}



}
