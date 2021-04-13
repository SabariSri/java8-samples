package com.epam.onboarding.practise.java8;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaListSortDesc {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(15);
        arrayList.add(60);

        System.out.println("Before Sorting " + arrayList);

        Collections.sort(arrayList, (a1, a2) -> {
            if (a1 < a2) {
                return +1;
            } else if (a1 > a2) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("After sorting " + arrayList);
    }
}
