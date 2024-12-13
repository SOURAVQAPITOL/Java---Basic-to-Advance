package com.qapitol.librarysystem.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qapitol.librarysystem.model.Address;
import com.qapitol.librarysystem.model.Book;
import com.qapitol.librarysystem.model.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImplementations implements Service {

    ObjectMapper mapper;
    String path = System.getProperty("user.dir") + "//src//main//java//com//qapitol//librarysystem//utils//Student.json";
    String bookPath = System.getProperty("user.dir") + "//src//main//java//com//qapitol//librarysystem//utils//Books.json";
    File bookFilepath = new File(bookPath);
    File filepath = new File(path);
    Scanner sc;
    Student student;
    Book book;
    Address address;

    @Override
    public Student addStudent(List<Student> students, List<Address> addresses) throws IOException {
        mapper = new ObjectMapper();
        student = new Student();
        sc = new Scanner(System.in);
        System.out.println("Enter student ID : ");
        int sid = sc.nextInt();
        student.setId(sid);

        System.out.println("Enter student name : ");
        String sName = sc.next();
        student.setName(sName);

        System.out.println("Enter student Age : ");
        int sAge = sc.nextInt();
        student.setAge(sAge);

        System.out.println("Enter student mobile number : ");
        long mNum = sc.nextLong();
        student.setMobileNumber(mNum);

        addAddress(addresses);
        student.setAddresses(addresses);

        students = mapper.readValue(filepath, new TypeReference<ArrayList<Student>>() {
        });
        students.add(student);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), students);
        System.out.println("Student added successfully!");

        return student;
    }

    @Override
    public void getAllStudent(List<Student> students) throws IOException {
        mapper = new ObjectMapper();
        students = mapper.readValue(filepath, new TypeReference<ArrayList<Student>>() {
        });
        students.add(student);
        System.out.println(students);
        System.out.println("Check the student details in JSON File");
    }

    @Override
    public Student getStudentByID(List<Student> students, int id) throws IOException {
        mapper = new ObjectMapper();
        students = mapper.readValue(filepath, new TypeReference<List<Student>>() {
        });
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student.getName());
                System.out.println(student.getAge());
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudentDetails(List<Student> students, int id) throws IOException {
        mapper = new ObjectMapper();
        students = mapper.readValue(filepath, new TypeReference<List<Student>>() {
        });
        for (Student student : students) {
            if (student.getId() == id) {
                sc = new Scanner(System.in);
                System.out.println("Enter new name: ");
                student.setName(sc.nextLine());

                System.out.println("Enter new age: ");
                student.setAge(sc.nextInt());

                System.out.println("Enter new mobile number: ");
                student.setMobileNumber(sc.nextLong());

                mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), students);
                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");

    }

    @Override
    public void removeStudent(int id) throws IOException {
        mapper = new ObjectMapper();
        List<Student> students = mapper.readValue(filepath, new TypeReference<List<Student>>() {
        });
        students.removeIf(student -> student.getId() == id);

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), students);
        System.out.println("Student with ID " + id + " removed.");
    }

    @Override
    public Book addBook(List<Book> bookList) throws IOException {
        book = new Book();
        sc = new Scanner(System.in);
        mapper = new ObjectMapper();

        System.out.println("Enter the book ID: ");
        int bID = sc.nextInt();
        book.setBookID(bID);

        System.out.println("Enter the count of the book: ");
        int bCount = sc.nextInt();
        book.setBookCount(bCount);

        System.out.println("Enter the subject: ");
        String sub = sc.next();
        book.setSubject(sub);

        bookList = mapper.readValue(bookFilepath, new TypeReference<List<Book>>() {
        });
        bookList.add(book);

        mapper.writerWithDefaultPrettyPrinter().writeValue(bookFilepath, bookList);
        System.out.println("Book added successfully!");
        return book;
    }

    @Override
    public void getAllBook(List<Book> bookList) throws IOException {
        mapper = new ObjectMapper();
        bookList = mapper.readValue(bookFilepath, new TypeReference<List<Book>>() {
        });
        System.out.println("All books: ");
        System.out.println(bookList);
    }

    @Override
    public Book getBookByID(List<Book> bookList, int bookId) throws IOException {
        mapper = new ObjectMapper();
        bookList = mapper.readValue(bookFilepath, new TypeReference<List<Book>>() {
        });

        for (Book book : bookList) {
            if (book.getBookID() == bookId) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void updateBookDetails(int bookId) throws IOException {
        mapper = new ObjectMapper();
        List<Book> books = mapper.readValue(bookFilepath, new TypeReference<List<Book>>() {
        });
        for (Book book : books) {
            if (book.getBookID() == bookId) {
                sc = new Scanner(System.in);
                System.out.println("Enter new subject: ");
                book.setSubject(sc.nextLine());

                System.out.println("Enter new book count: ");
                book.setBookCount(sc.nextInt());

                mapper.writerWithDefaultPrettyPrinter().writeValue(bookFilepath, books);
                System.out.println("Book details updated successfully!");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    @Override
    public void removeBook(int bookId) throws IOException {

        mapper = new ObjectMapper();
        List<Book> books = mapper.readValue(bookFilepath, new TypeReference<List<Book>>() {
        });
        books.removeIf(book -> book.getBookID() == bookId);
        mapper.writerWithDefaultPrettyPrinter().writeValue(bookFilepath, books);
        System.out.println("Book with ID " + bookId + " removed.");
    }

    @Override
    public Address addAddress(List<Address> addresses) {
        mapper = new ObjectMapper();
        address = new Address();
        sc = new Scanner(System.in);

        System.out.println("Enter Street Address : ");
        String streetName = sc.next();
        address.setStreetName(streetName);
        System.out.println("Enter Complete Address : ");
        String completeAddressName = sc.next();
        address.setCompleteAddress(completeAddressName);
        System.out.println("Enter PinCode : ");
        int pin = sc.nextInt();
        address.setPincode(pin);

        addresses.add(address);

        return address;
    }

    @Override
    public void borrowBooks(List<Student> students, List<Book> books, int studentId, int bookId) throws IOException {
        mapper = new ObjectMapper();
        students = mapper.readValue(filepath, new TypeReference<List<Student>>() {
        });
        books = mapper.readValue(bookFilepath, new TypeReference<List<Book>>() {
        });

        Student student = null;
        for (Student s : students) {
            if (s.getId() == studentId) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student with ID " + studentId + " not found.");
            return;
        }

        Book book = null;

        for (Book b : books) {
            if (b.getBookID() == bookId) {
                book = b;
                break;
            }
        }

        if (book == null) {
            System.out.println("Book with ID " + bookId + " not found.");
            return;
        }

        if (book.getBookCount() > 0) {

            book.setBookCount(book.getBookCount() - 1);

            if (student.getBorrowedBooks() == null) {
                student.setBorrowedBooks(new ArrayList<>());
            }
            student.getBorrowedBooks().add(book);

            mapper.writerWithDefaultPrettyPrinter().writeValue(filepath, students);
            mapper.writerWithDefaultPrettyPrinter().writeValue(bookFilepath, books);

            System.out.println("Student " + student.getName() + " has successfully borrowed the book: " + book.getSubject());
        } else
        {
            System.out.println("The book is not available for borrowing.");
        }
    }
}
