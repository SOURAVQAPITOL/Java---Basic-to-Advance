package com.qapitol.relationship;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public static void main(String[] args) throws IOException {

        String filePath = System.getProperty("user.dir") + "//src//main//resources//Files//Student.yaml";

        Student student = new Student();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        book1.setBookName("Software Testing");
        book1.setBookTitle("Automation selenium");

        book2.setBookName("Software Testing");
        book2.setBookTitle("API Automation");

        student.setName("Sourav");
        student.setAge(25);
        student.setBooks(books);

        System.out.println(student.toString());

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), student);

        Student s2 = mapper.readValue(filePath ,Student.class);
        System.out.println(s2);
    }
}
