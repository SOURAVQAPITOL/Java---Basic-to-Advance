package com.qapitol.basics;

import java.util.Scanner;

public class UserInputsSwitchCase {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();

        sc.nextLine();
        System.out.println("Choose the operation : (Add, Sub, Multi, Div)");

        double result;
        String choise = sc.nextLine();

        switch (choise) {
            case "Add":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "Sub" :
                result = num1-num2;
                System.out.println(result);
                break;
            case "multi":
                result = num1*num2;
                System.out.println(result);
                break;
            case "div":
                result = num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid numbers");
        }
    }
}
