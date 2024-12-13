package com.qapitol.basicassignment;

import java.util.Scanner;

public class AreaOfRectAngle {

    public static void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectAngle is : "+area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle : ");
        double length = sc.nextDouble();

        System.out.println("Enter the width of Rectangle : ");
        double width = sc.nextDouble();
        areaOfRectangle(length, width);
    }
}
