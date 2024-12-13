package com.qapitol.oops;

public class Student extends Person {

    private String courses;
    private int marks;

    public static String A = "A -Grade";
    public static String B = "B -Grade";
    public static String D = "D -Grade";

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getMarks() {
        if (marks >= 70) {
            return A;
        } else if (marks >= 50) {
            return B;
        }else if(marks >= 10){
            return D;
        }
        return "invalid marks";
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses='" + courses + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    void displayDetails() {

        System.out.println("Student ID : "+courses);
        System.out.println("Student ID : "+marks);


//        System.out.println(" ID = " + getId() + " Name = " + getName() + " AGE = " + getAge() +
//                " Course = " + getCourses() + " Marks = " + getMarks());
    }
}
