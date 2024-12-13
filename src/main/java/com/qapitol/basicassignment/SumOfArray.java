package com.qapitol.basicassignment;

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5,};

        int sum = 0;

        for (int a : arr1) {
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
