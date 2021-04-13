package com.epam.onboarding.practise.java8;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsProcessingDemo {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("abc");
        stringArray.add("xyz");
        stringArray.add("abc");
        stringArray.add("xyz");

        System.out.println(stringArray);

        Set<String> uniqueNames = stringArray.stream().map((str) -> str.toUpperCase()).collect(Collectors.toSet());

        System.out.println(uniqueNames);
    }
}
