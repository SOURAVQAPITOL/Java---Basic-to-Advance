package com.qapitol.basics;

public class Febonac {

    public static void main(String[] args) {

        int firstNum = 0;
        int lastNum = 1;
        int sum = 0;

        for (int i = 0; i<=100;i++) {
            sum = firstNum + lastNum;
            firstNum= lastNum;
            lastNum=sum;
            if (sum>100) {
                break;
            }
            System.out.println(sum);
        }
    }
}
