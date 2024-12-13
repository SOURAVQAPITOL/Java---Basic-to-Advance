package com.qapitol.basicassignment;

import java.util.Scanner;

public class VoteEligibility {

    public static void AgeForVoting(int age){
        if (age >= 18 && age< 100){
            System.out.println("Eligible for voting");
        } else if (age<18) {
            System.out.println("Not Eligible for voting");
        }else
            System.out.println("Incorrect Age Format");
    }

    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the Age for voting : ");
        int age = sc.nextInt();
        AgeForVoting(age);
    }
}
