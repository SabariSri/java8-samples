package com.epam.onboarding.practise.java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (i, j) -> (i+j) % 2 == 0;
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(15,20));
    }
}
