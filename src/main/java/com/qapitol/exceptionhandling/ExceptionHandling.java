package com.qapitol.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int first =  sc.nextInt();
        int second = sc.nextInt();

        double result = 0 ;

        try {
            result = first/second;

            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Please enter the second value correct"+e);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Continue");
        }
    }
}
