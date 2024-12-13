package com.qapitol.controller.service;

import com.qapitol.controller.model.Student;
import com.qapitol.controller.model.Teacher;

import java.util.List;

public interface Services {

    void addStudent(List<Student> list);

    void addTeacher(List<Teacher> teacherlist);

}
