package com.qapitol.basicassignment;

public class ArmstrongInLoop {

    public static void main(String[] args) {

        int rem;

        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int result = 0;
            while (num > 0) {
                rem = num % 10;
                result = result + rem * rem * rem;
                num = num / 10;
            }
            if (i == result)
                System.out.println(i);
        }
    }
}
