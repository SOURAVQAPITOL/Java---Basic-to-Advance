package com.qapitol.basicassignment;

import java.util.Scanner;

public class LargestOfThreeNumbers {

    public void greaterInThreeNumbers(int x,int y,int z){
        if (x>y && x>z){
            System.out.println(x+" is grater");
        }
        else if (y>x && y>z){
            System.out.println(y + " is grater");
        }
        else {
            System.out.println(z+" is grater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num");
        int x = sc.nextInt();
        System.out.println("Enter second num");
        int y = sc.nextInt();
        System.out.println("Enter third num");
        int z  = sc.nextInt();
        LargestOfThreeNumbers threeNumbers =  new LargestOfThreeNumbers();
        threeNumbers.greaterInThreeNumbers(x,y,z);
    }
}
