package com.qapitol.controller.controller;

import com.qapitol.controller.model.Student;
import com.qapitol.controller.model.Teacher;
import com.qapitol.controller.service.ServiceImplementation;
import com.qapitol.controller.service.Services;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        Services services = new ServiceImplementation();


        services.addStudent(students);
        services.addTeacher(teachers);


    }
}
