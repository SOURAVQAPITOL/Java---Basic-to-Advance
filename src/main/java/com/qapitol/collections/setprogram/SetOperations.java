package com.qapitol.collections.setprogram;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {


        //set wont allows duplicate values but list allows

        //HashSet wont maintain the order randomly it will print
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(5);
        set.add(5);
        set.add(8);
        set.add(8);
        set.add(9);
        System.out.println(set);
        set.remove(8); //it will remove the all 8 numbers (object)
        System.out.println(set);


    }
}
