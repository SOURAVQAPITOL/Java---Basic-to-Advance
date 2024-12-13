package com.qapitol.basicassignment;

import java.util.Random;
import java.util.Scanner;

public class FlipTheCoinMultipleTimes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times you want to flip");
        int flipCoin = sc.nextInt();
        int heads = 0;
        int tails = 0;

        Random random = new Random();
        for (int i = 1; i <= flipCoin; i++) {
            int flip = random.nextInt(2);

            if (flip == 0)
                heads++;
            else
                tails++;
        }
        System.out.println("The heads count is : " + heads);
        System.out.println("The tails count is : " + tails);
    }
}
