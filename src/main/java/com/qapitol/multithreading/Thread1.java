package com.qapitol.multithreading;

public class Thread1 implements Runnable{

    public void run(){

        for (int i = 0 ; i <= 20; i++){
        System.out.println("Running thread1 "+i+ " Thread Name : "+Thread.currentThread());}
    }
}
