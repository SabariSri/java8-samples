package com.epam.onboarding.practise.java8;

import java.util.TreeMap;

public class LambdaTreeSortDesc {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>((t1, t2) -> {
            if (t1 < t2) {
                return +1;
            } else if (t1 > t2) {
                return -1;
            } else {
                return 0;
            }
        });

        treeMap.put(100,"one");
        treeMap.put(600,"two");
        treeMap.put(300,"three");

        System.out.println("Sorting" + treeMap);
    }
}
