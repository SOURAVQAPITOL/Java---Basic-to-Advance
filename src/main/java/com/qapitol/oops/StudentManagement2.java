package com.qapitol.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student id : ");
        int id = sc.nextInt();
        System.out.println("Enter student Name : ");
        String name = sc.next();
        System.out.println("Enter student age : ");
        int age = sc.nextInt();
        System.out.println("Enter course Name : ");
        String course = sc.next();
        System.out.println("Enter Marks Name : ");
        int marks = sc.nextInt();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setCourses(course);
        student.setMarks(marks);

        ArrayList<Student> studentsDetails = new ArrayList<Student>();
        studentsDetails.add(student);
        student.displayDetails();
        System.out.println(student.getMarks());
        System.out.println("Enter teacher id : ");
        int tid = sc.nextInt();
        System.out.println("Enter teacher Name : ");
        String tname = sc.next();
        System.out.println("Enter teacher age : ");
        int tage = sc.nextInt();
        System.out.println("Enter Subject Name : ");
        String subject = sc.next();

        System.out.println("Enter Salary : ");
        int sal = sc.nextInt();

        Teacher teacher = new Teacher();
        teacher.setId(tid);
        teacher.setName(tname);
        teacher.setAge(tage);
        teacher.setSubjectTeacher(subject);
        teacher.setSalary(sal);

        ArrayList<Teacher> teacherDetails = new ArrayList<Teacher>();
        teacherDetails.add(teacher);
        teacher.displayDetails();
    }
}
