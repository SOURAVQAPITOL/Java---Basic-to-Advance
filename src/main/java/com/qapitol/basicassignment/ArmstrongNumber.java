package com.qapitol.basicassignment;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 1000 : ");
        //153

        int num = sc.nextInt();
        int rem;
        int result = 0;

        int temp = num;

        for (int i =1; i<=1000; i++) {
            while (num > 0) {
                rem = num % 10;
                result = result + rem * rem * rem;
                num = num / 10;
            }
        }

        if (temp == result || temp<1000)
            System.out.println("Armstrong number");
        else if (temp == result || temp>1000)
            System.out.println("Enter valid number");
        else
            System.out.println("Not an armstrong number");

    }
}
