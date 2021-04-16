package com.KudryashevDaniil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtils {
    public static<T> void addAll(List<? super T> source, List<T> destination) {
        for (T c: destination) {
            source.add(c);
        }
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> int indexOf(List<? super T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List<T> limit(List<T> source, int size) {
        return source.stream().limit(size).collect(Collectors.toList());
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<?> removeFrom, List<T> c2) {
        for (T c: c2) {
            if (removeFrom.contains(c))
                removeFrom.remove(c);
        }
    }

    public static <T> boolean containsAll(List<?> c1, List<T> c2) {
        for (T c: c2) {
            if (!c1.contains(c2))
                return false;
        }
        return true;
    }

    public static <T> boolean containsAny(List<?> c1, List<T> c2) {
        for (T c: c2) {
            if (c1.contains(c2))
                return true;
        }
        return false;
    }

    public static <T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        return list.stream().sorted().filter(x -> x.compareTo(min) >= 0 && x.compareTo(max) <= 0).collect(Collectors.toList());
    }

    public static <T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        return list.stream().sorted().filter(x -> comparator.compare(x, min) >= 0 && comparator.compare(x, max) <= 0).collect(Collectors.toList());
    }

}
