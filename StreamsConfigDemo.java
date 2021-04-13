package com.epam.onboarding.practise.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConfigDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Test");
        list.add("Test1");

        Stream<String> stream = list.stream();

        List<String> finalList = stream.filter((str) -> str.length() > 4).collect(Collectors.toList());

        System.out.println(finalList);

        System.out.println("---------------------");

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(0);
        intList.add(1);
        intList.add(2);

        System.out.println("With Streams " + intList);

        List<Integer> evenNumberList = intList.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(evenNumberList);

    }
}
