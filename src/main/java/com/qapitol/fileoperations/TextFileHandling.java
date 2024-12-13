package com.qapitol.fileoperations;

import java.io.*;

public class TextFileHandling {


    public static void main(String[] args) throws IOException {

        String fileName = "Temp.txt";
        File file = new File(System.getProperty("user.dir") + "//src//main//resources//Files" + fileName);

        if (file.exists()) {
            file.createNewFile();
        }

//        FileOutputStream fis = new FileOutputStream(file);

        BufferedWriter brw = new BufferedWriter(new FileWriter(file));
        BufferedReader brr = new BufferedReader(new FileReader(file));

        brw.write("This is a demo project");  //to write

        brw.close();

        System.out.println("file writing successfully");

        String data = brr.readLine();  // to read

        String data1 = null;
//        while (data1 = brr.readLine() != null){
//            System.out.println(brr.readLine());
//        }

        brr.close();
        System.out.println(data);


    }

}
