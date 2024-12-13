package com.qapitol.librarysystem.service;

import com.qapitol.librarysystem.model.Address;
import com.qapitol.librarysystem.model.Book;
import com.qapitol.librarysystem.model.Student;

import java.io.IOException;
import java.util.List;

public interface Service {

    Student addStudent(List<Student> students, List<Address> addresses) throws IOException;

    void getAllStudent(List<Student> students) throws IOException;

    Student getStudentByID(List<Student> students,int id) throws IOException;

    void updateStudentDetails(List<Student> students, int id) throws IOException;

    void removeStudent(int id) throws IOException;

    Book addBook(List<Book> bookList) throws IOException;

    void getAllBook(List<Book> bookList) throws IOException;

    Book getBookByID(List<Book> bookList, int bookId) throws IOException;

    void updateBookDetails(int bookId) throws IOException;

    void removeBook(int bookId) throws IOException;

    Address addAddress(List<Address> addresses);

    void borrowBooks(List<Student> students, List<Book> books, int studentId, int bookId) throws IOException;

}
