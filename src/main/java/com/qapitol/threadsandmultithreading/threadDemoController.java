package com.qapitol.threadsandmultithreading;

public class threadDemoController {

    public static void main(String[] args) {

        System.out.println("Main method "+Thread.currentThread().getName());

        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        thread2.start();

        System.out.println("main method executed sucessfully");
    }
}
