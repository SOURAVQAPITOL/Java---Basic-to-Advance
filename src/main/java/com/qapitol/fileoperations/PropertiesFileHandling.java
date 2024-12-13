package com.qapitol.fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//Files//global.properties");
        Properties prob = new Properties();
        prob.load(fis);

        String data = prob.getProperty("company");
        System.out.println(data);

        prob.setProperty("location", "JP Nagar");
        prob.setProperty("testing", "QA");
        prob.setProperty("name", "sourav");
        prob.setProperty("add", "madiwala");
        prob.setProperty("age", "18");
        String data2 = prob.getProperty("name");

        prob.store(new FileOutputStream(System.getProperty("user.dir")+"//src//main//resources//Files//global.properties"), "New Added stuff");

        prob.clear();

        System.out.println(data2);
    }
}
