package com.qapitol.basics;

import java.util.Scanner;

public class EvenOddWithConstructor {

    int num;

    public EvenOddWithConstructor(int number){
        this.num = number;
    }

    public boolean checkEven() {
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
        EvenOddWithConstructor evenOdd = new EvenOddWithConstructor(num);
        evenOdd.checkEven();
    }
}
