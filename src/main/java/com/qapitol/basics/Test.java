package com.qapitol.basics;

public class Test {

    static {

        System.out.println("static block");
    }

    public static void main(String[] args) {
        openBrowser();
        System.out.println("main method");

    }

    // if access specifier is not there it will take default and it is upto package level scope

    static void openBrowser()
    {
        System.out.println("static method");
    }
}
