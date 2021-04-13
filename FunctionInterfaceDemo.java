package com.epam.onboarding.practise.java8;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<String, Integer> fn = (str) -> str.length();
        System.out.println(fn.apply("Test"));

        Function<Integer, Integer> fn1 = (i) -> i + 2;
        Function<Integer, Integer> fn2 = (i) -> i * 2;

        System.out.println(fn1.andThen(fn2).apply(2));



    }
}
