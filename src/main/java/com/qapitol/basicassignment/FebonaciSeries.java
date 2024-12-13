package com.qapitol.basicassignment;

public class FebonaciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
             {
                sum = first + second;
                first = second;
                second = sum;
                if(sum>100){
                    break;
                }
                 System.out.println(sum);
            }
        }
    }
}
