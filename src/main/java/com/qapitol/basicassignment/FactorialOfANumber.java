package com.qapitol.basicassignment;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        int num = sc.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial is : " + fact);
    }

}
