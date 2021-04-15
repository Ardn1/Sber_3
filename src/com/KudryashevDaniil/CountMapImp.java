package com.KudryashevDaniil;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountMapImp<T> implements CountMap<T> {
    private HashMap<T, Integer> map;

    public CountMapImp() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(T o) {
        if (map.containsKey(o)) {
            map.put(o, 1 + map.get(o));
        } else {
            map.put(o, 1);
        }
    }

    @Override
    public int getCount(T o) {
        if (map.containsKey(o)) {
            return map.get(o);
        } else {
            return 0;
        }
    }

    @Override
    public int remove(T o) {
        if (map.containsKey(o)) {
            if (map.get(o) <= 1) {
                map.remove(o);
                return 1;
            } else {
                map.put(o, map.get(o) - 1);
                return 1 + map.get(o);
            }
        } else {
            return 0;
        }
    }

    @Override
    public int size() {
        return map.keySet().size();
    }

    private void addMany(T o, Integer i) {
        if (map.containsKey(o)) {
            map.put(o, 1 + map.get(o));
        } else {
            map.put(o, 1);
        }
    }

    @Override
    public void addAll(CountMap<T> source) {
        for (T keyNew : source.toMap().keySet()) {
            addMany(keyNew, source.getCount(keyNew));
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return new HashMap(map);
    }

    @Override
    public void toMap(Map<? super T, Integer> destination) {
        destination.clear();
        destination.putAll(map);
    }
}
