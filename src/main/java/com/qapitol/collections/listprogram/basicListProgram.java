package com.qapitol.collections.listprogram;

import java.util.*;

public class basicListProgram {

    public static void main(String[] args) {

//A List maintains the insertion order of elements, meaning elements are stored in the order they were added.
//Unlike a Set, a List can have duplicate elements, so the same object can appear multiple times.
//You can access elements in a List using their index, similar to arrays. The index starts from 0.

        //Array List
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1,"Cherry");

        String Applefruit = fruits.get(1);
        System.out.println(Applefruit);

        fruits.set(1, "Grapes"); //replace Cherry and add Grapes

        String Grapefruit = fruits.get(1);
        System.out.println(Grapefruit);

//        fruits.removeFirst(); //first ele will be removed

        int size  =  fruits.size();
        System.out.println(size);

    }
}