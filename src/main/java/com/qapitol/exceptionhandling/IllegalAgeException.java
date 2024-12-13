package com.qapitol.exceptionhandling;

import java.util.Scanner;

public class IllegalAgeException extends Exception {

    public IllegalAgeException(String exc){
        super(exc);
        System.out.println("Exception -----");
    }

    public static void main(String[] args) throws IllegalAgeException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age above 18");
        long age = sc.nextLong();

        //Type casting
        int intAge = (int) age;

        if(intAge<18){
            throw new IllegalAgeException("Illigal age");
        }

        sc.close();
    }
}
