package com.qapitol.basicassignment;

import java.util.Scanner;

public class PalindromOfANumber {

    public static void checkPalindromOrNot(int num) {
        int originalNumber = num;
        int rev = 0;
        while (num != 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        if (originalNumber == rev) {
            System.out.println("This is a Palindrom Number");
        } else {
            System.out.println("Not a Palindrom Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        checkPalindromOrNot(num);
    }
}
