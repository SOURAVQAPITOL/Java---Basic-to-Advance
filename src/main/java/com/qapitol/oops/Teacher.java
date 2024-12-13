package com.qapitol.oops;

public class Teacher extends Person{

    private String subjectTeacher;
    private long salary;

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println(" ID = " + getId() + " Name = " + getName() + " AGE = " + getAge() +
                " Subject_Teacher = " + getSubjectTeacher() + " Salary = " + getSalary());
    }
}
