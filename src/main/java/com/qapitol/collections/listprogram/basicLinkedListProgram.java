package com.qapitol.collections.listprogram;

import java.util.LinkedList;
import java.util.List;

public class basicLinkedListProgram {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

//        List<Integer> listt =  new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");

        fruits.addFirst("Grapes");
        fruits.addLast("Pineapple");


        fruits.remove("Banana");

        System.out.println(fruits);

    }
}
