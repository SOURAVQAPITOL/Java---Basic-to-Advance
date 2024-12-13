package com.qapitol.basicassignment;

public class SortingTheArray {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 6, 5, 9};

        for (int i = 0; i <= numbers.length - 1; i++) {

            for (int j = 0; j <= numbers.length - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        for (int i = 0; i<=numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
