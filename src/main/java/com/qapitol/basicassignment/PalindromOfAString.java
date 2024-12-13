package com.qapitol.basicassignment;

public class PalindromOfAString {

    public static void main(String[] args) {
        String characters = "ABCBA";
        String org_String = characters;
        String rev = "";

        int strLength = characters.length();

        for (int i = strLength - 1; i >= 0; i--) {

            rev = rev + characters.charAt(i);
        }
        System.out.println(rev);

        if (rev.equals(org_String)) {
            System.out.println("Palindrom number");
        } else {
            System.out.println("Not A Palindrom");
        }


    }
}
