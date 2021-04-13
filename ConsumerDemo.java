package com.epam.onboarding.practise.java8;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> {
            System.out.println(str.toUpperCase());
        };
        consumer.accept("Test");

        Consumer<Integer> consumer1 = (i) -> {
            System.out.println(i + 2);
        };

        Consumer<Integer> consumer2 = (i) -> {
            System.out.println(i * 2);
        };

        Consumer<Integer> consumer3 = (i) -> {
            System.out.println(i - 2);
        };

        consumer1.andThen(consumer2).andThen(consumer3).accept(2);

    }
}
