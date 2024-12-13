package com.qapitol.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Student student;
        Teacher teacher;
        int input;

        ArrayList<Student> studentsDetails = new ArrayList<>();
        ArrayList<Teacher> teacherDetails = new ArrayList<>();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter input number : 1.Add student, 2.Add teacher, 3.Exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    student = new Student();
                    System.out.println("Enter student id : ");
                    int id = sc.nextInt();
                    System.out.println("Enter student Name : ");
                    String name = sc.next();
                    System.out.println("Enter student age : ");
                    int age = sc.nextInt();
                    System.out.println("Enter course Name : ");
                    String course = sc.next();
                    System.out.println("Enter Marks : ");
                    int marks = sc.nextInt();
                    student.setId(id);
                    student.setName(name);
                    student.setAge(age);
                    student.setCourses(course);
                    student.setMarks(marks);
//                    ArrayList<Student> studentsDetails = new ArrayList<Student>();
                    studentsDetails.add(student);
                    student.displayDetails();
                    System.out.println(student.getMarks());
                    break;

                case 2:
                    System.out.println("Enter teacher id : ");
                    int tid = sc.nextInt();
                    System.out.println("Enter teacher Name : ");
                    String tname = sc.next();
                    System.out.println("Enter teacher age : ");
                    int tage = sc.nextInt();
                    System.out.println("Enter Subject Name : ");
                    String subject = sc.next();
                    System.out.println("Enter Salary : ");
                    long sal = sc.nextLong();
                    teacher = new Teacher();
                    teacher.setId(tid);
                    teacher.setName(tname);
                    teacher.setAge(tage);
                    teacher.setSubjectTeacher(subject);
                    teacher.setSalary(sal);
                    teacherDetails.add(teacher);
                    teacher.displayDetails();
                    break;
            }
        }
        while (input != 3);

        System.out.println(studentsDetails);
    }
}
