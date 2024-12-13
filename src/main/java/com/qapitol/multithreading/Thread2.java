package com.qapitol.multithreading;

public class Thread2 implements Runnable{

    public void run(){

        for (int i = 0 ; i <= 20; i++){
            System.out.println("Running thread2 "+i+ " Thread Name : "+Thread.currentThread());}
    }
}
