package com.qapitol.collections.listprogram;

import java.util.Stack;

public class basicStackProgram {

    public static void main(String[] args) {

        //The last element pushed onto the stack is the first element to be popped off.
        Stack<String> fruits = new Stack<>();
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Grapes");

        String top = fruits.pop(); //it will remove and show the top fruits which is stored.
        System.out.println(top);

        String peek = fruits.peek(); //it will show the top fruits which is stored.
        System.out.println(peek); // to check the latest record

//        int position = fruits.search("Apple");
//        System.out.println(position);

        System.out.println(fruits);
    }
}
