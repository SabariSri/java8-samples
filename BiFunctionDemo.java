package com.epam.onboarding.practise.java8;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String > biFunction = (i,j) -> {
            Integer result = i*j;
            return result.toString();
        };
        System.out.println(biFunction.apply(10, 20));
    }
}
