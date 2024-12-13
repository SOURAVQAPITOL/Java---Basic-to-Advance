package com.qapitol.collections.mapprogram;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        //key can to be duplicate

        map.put(1,"Sourav");
        map.put(2,"SSourav");
        map.put(3,"SOOuravv");
        map.put(4,"souRRAv");

        System.out.println(map);
        System.out.println(map.get(2));

        //to retrieve all the keys
        System.out.println(map.keySet());
        System.out.println(map.values());
//        map.remove(1);
//        System.out.println(map);

        for (Map.Entry<Integer,String> values : map.entrySet()){

        }

    }
}
