package com.KudryashevDaniil;

import java.util.ArrayList;
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

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list.toString());
        System.out.println(CollectionUtils.range(list, 3, 6));
    }
}
