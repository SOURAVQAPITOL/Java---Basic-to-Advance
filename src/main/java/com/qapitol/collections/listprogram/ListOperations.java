package com.qapitol.collections.listprogram;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {

        //List is an interface and array list is a class
        List<Integer> list1 =  new ArrayList<Integer>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(4);
        //List always maintain the order
        System.out.println(list1);

        List<Integer> list2 =  new ArrayList<Integer>();
        list2.add(10);
        list2.add(21);
        list2.add(41);
        list2.add(55);

        System.out.println(list2);

        list1.remove(1);

        //join both the list
        list1.addAll(list2);
        System.out.println(list1);


    }
}
