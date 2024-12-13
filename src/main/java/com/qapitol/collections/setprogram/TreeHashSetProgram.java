package com.qapitol.collections.setprogram;

import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetProgram {
    public static void main(String[] args) {

        //it will print with sorted order and without duplicates
        Set<Integer> tree = new TreeSet<>();

        tree.add(3);
        tree.add(7);
        tree.add(4);
        tree.add(1);
        tree.add(0);
        tree.add(5);

        System.out.println(tree);

    }
}
