package com.epam.onboarding.practise.java8;

import java.util.function.Function;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> sum = (a) -> a*10;
        System.out.println(sum.apply(10));
    }
}
