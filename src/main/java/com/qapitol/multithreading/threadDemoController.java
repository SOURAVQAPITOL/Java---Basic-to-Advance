package com.qapitol.multithreading;

public class threadDemoController {

    public static void main(String[] args) {

        System.out.println("Main method "+Thread.currentThread().getName());

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();


        Thread thread11 = new Thread(thread1);
        thread11.start();
        Thread thread12 = new Thread(thread2);
        thread12.start();

        System.out.println("main method executed sucessfully");
    }
}
