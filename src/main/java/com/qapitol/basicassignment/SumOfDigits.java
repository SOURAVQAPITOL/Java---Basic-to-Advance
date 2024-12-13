package com.qapitol.basicassignment;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        for (int j = 0; j < num.length; j++) {
            System.out.println("Enter a number : ");
            int input = sc.nextInt();
            num[j] = input;
        }

        int sumOfDigits = 0;
        for (int i = 0; i < num.length; i++) {
            sumOfDigits = sumOfDigits + num[i];
        }
        System.out.println("Sum of all the digits : "+sumOfDigits);
    }
}
