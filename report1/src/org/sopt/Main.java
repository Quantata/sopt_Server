package org.sopt;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //Department
        ArrayList<Department> departmentArrayList = new ArrayList<>();

        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();

        departmentArrayList.add(department1);
        departmentArrayList.add(department2);
        departmentArrayList.add(department3);

        for(Department d : departmentArrayList){
            System.out.println(d.toString());
        }

        //Professor
        ArrayList<Professor> professorArrayList = new ArrayList<>();

        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        Professor professor3 = new Professor();

        professorArrayList.add(professor1);
        professorArrayList.add(professor2);
        professorArrayList.add(professor3);

        for(Professor p : professorArrayList){
            System.out.println(p.toString());
        }


        //University
        ArrayList<University> universityArrayList = new ArrayList<>();

        University university1 = new University();
        University university2 = new University();
        University university3 = new University();

        universityArrayList.add(university1);
        universityArrayList.add(university2);
        universityArrayList.add(university3);

        for(final University s : universityArrayList){
            System.out.println(s.toString());
        }

        //Student
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);


        for(final Student s : studentArrayList){
            System.out.println(s.toString());
        }
    }
}
