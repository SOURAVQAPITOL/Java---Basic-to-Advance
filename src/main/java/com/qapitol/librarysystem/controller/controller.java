package com.qapitol.librarysystem.controller;


import com.qapitol.librarysystem.model.Address;
import com.qapitol.librarysystem.model.Book;
import com.qapitol.librarysystem.model.Student;
import com.qapitol.librarysystem.service.Service;
import com.qapitol.librarysystem.service.ServiceImplementations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controller {

    public static void main(String[] args) throws IOException {

        Service service = new ServiceImplementations();
        List<Student> students = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();

        int input;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your preference : 1.Student, 2.Book, 3.Exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Choose your preference : 1.Add Student, 2.Get All the students, " +
                            "3.Get Student By ID, 4.Update Student details, 5.Remove student, 6.Borrow books, 7.Go to Book");
                    int newInput = sc.nextInt();
                    switch (newInput) {
                        case 1:
                            service.addStudent(students,addresses);
                            break;
                        case 2:
                            service.getAllStudent(students);
                            break;
                        case 3:
                            System.out.println("Enter the student ID  : ");
                            int id = sc.nextInt();
                            service.getStudentByID(students, id);
                            break;
                        case 4:
                            System.out.println("Enter the student id to be updated");
                            int sid = sc.nextInt();
                            service.updateStudentDetails(students, sid);
                            break;
                        case 5:
                            System.out.println("Enter the student id to be removed");
                            int ssid = sc.nextInt();
                            service.removeStudent(ssid);
                            break;
                        case 6:
                            System.out.println("Enter the student ID");
                            int studentID = sc.nextInt();
                            System.out.println("Enter the book ID");
                            int bookID = sc.nextInt();
                            service.borrowBooks(students,books,studentID, bookID);
                            break;
                        case 7:
                            System.out.println("Please enter 2 for get the books");
                            break;
                        default:
                            System.out.println("invalid number selected");
                    }

                    break;

                case 2:
                    System.out.println("Choose your preference : 1.Add Book, 2.Get All the books, " +
                            "3.Get Book By ID, 4.Update Book details, 5.Remove book, 6.Go to Student");
                    int bookInput = sc.nextInt();
                    switch (bookInput) {
                        case 1:
                            service.addBook(books);
                            break;
                        case 2:
                            service.getAllBook(books);
                            break;
                        case 3:
                            System.out.println("Enter the bookID : ");
                            int bookID = sc.nextInt();
                            service.getBookByID(books, bookID);
                        case 4:
                            System.out.println("Enter the bookID : ");
                            int id = sc.nextInt();
                            service.updateBookDetails(id);
                        case 5:
                            System.out.println("Enter the bookID : ");
                            int bid = sc.nextInt();
                            service.removeBook(bid);
                        case 6:
                            System.out.println("Enter 1 for student");
                            break;
                        default:
                            System.out.println("invalid number selected");
                    }
                    break;
            }
        }
        while (input != 3);
    }
}
