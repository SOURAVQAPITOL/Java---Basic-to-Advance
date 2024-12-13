package com.qapitol.collections.setprogram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {
    public static void main(String[] args) {

        //it will maintaining the order
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(2);
        set.add(1);
        set.add(8);
        set.add(8);
        set.add(5);
        set.add(5);
        set.add(9);

        System.out.println(set);
        set.remove(8); //it will remove the all 8 numbers (object)
        System.out.println(set);
    }
}
