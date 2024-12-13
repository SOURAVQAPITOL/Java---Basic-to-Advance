package com.qapitol.basics;

import java.util.Scanner;

public class EvenOdd {


    public static boolean checkEven(int num) {

        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        checkEven(num);
    }
}
