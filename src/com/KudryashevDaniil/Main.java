package com.KudryashevDaniil;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        CountMap<String> map = new CountMapImp();

        map.add("One");
        map.add("One");
        map.add("Two");
        System.out.println(map.getCount("One"));
        System.out.println(map.getCount("Two"));
        System.out.println(map.size());
        System.out.println("----------------");
        map.remove("One");
        map.remove("Two");
        System.out.println(map.getCount("One"));
        System.out.println(map.getCount("Two"));
        System.out.println(map.size());

        Map<String, Integer> mamp = map.toMap();
        System.out.println(mamp.get("One"));
    }
}
