package com.qapitol.controller.service;

import com.qapitol.controller.model.Student;
import com.qapitol.controller.model.Teacher;

import java.util.List;
import java.util.Scanner;


public class ServiceImplementation implements Services {

    Student student;
    Teacher teacher;
    Scanner sc;

    @Override
    public void addStudent(List<Student> list) {
        student = new Student();
        sc = new Scanner(System.in);
        System.out.println("Enter student id : ");
        int sid = sc.nextInt();
        student.setId(sid);
        System.out.println("Enter student Age : ");
        int sAge = sc.nextInt();
        student.setAge(sAge);
        System.out.println("Enter student Name : ");
        String sName = sc.next();
        student.setName(sName);
        list.add(student);
        System.out.println("Student Id : " + " " + student.getId() + " " + "Student Age : "
                + student.getAge() + " " + "Student name : " + " " + student.getName());
    }

    @Override
    public void addTeacher(List<Teacher> teacherlist) {
        teacher = new Teacher();
        sc = new Scanner(System.in);
        System.out.println("Enter Teacher Name : ");
        String tName = sc.next();
        teacher.setName(tName);
        System.out.println("Enter Subject Name : ");
        String tSubj = sc.next();
        teacher.setSubject(tSubj);
        System.out.println("Enter Teacher Salary : ");
        long sal = sc.nextLong();
        teacher.setSalary(sal);

        teacherlist.add(teacher);

        System.out.println("Teacher Name : " + " " + teacher.getName() + " " + "Subject Name: "
                + teacher.getSubject() + " " + "Teacher salary : " + " " + teacher.getSalary());
    }
}
