package com.qapitol.basics;

import java.util.Arrays;

public class sortingTheArrays {

    public static void main(String[] args) {


        int[] numbers = {1, 4, 2, 6, 8, 3, 9};
        int temp = 0;

        int length =  numbers.length;
        System.out.println(length);
        for (int i = 0; i<= numbers.length-1; i++){
            for (int j = 0; j<= numbers.length-1; j++){

                if (numbers[i]<numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
