package com.qapitol.basics;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 50;

        while (num!=0){

            for (int i =2; i<=num; i++){

                if (num%i==1){
                    System.out.println("The Prime number is "+ num);
                }
            }

        }
    }
}
