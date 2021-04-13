package com.epam.onboarding.practise.java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        int[] inp1 = {5, 10, 35, 25, 30};
        int inp2 = 5;
        String inp3 = "test";

        Predicate<Integer> predicate1 = i -> i > 10;
        testCondition(predicate1, inp1);
        testCondition(predicate1.negate(), inp1);

        Predicate<Integer> predicate2 = i -> i < 10;
        System.out.println(predicate2.test(inp2));
        testCondition(predicate1.and(predicate2), inp1);

        Predicate<String> predicate3 = Predicate.isEqual("Test");
        System.out.println(predicate3.test(inp3));
    }

    public static void testCondition(Predicate<Integer> integerPredicate, int[] inpArray) {
        for (int i : inpArray) {
            if (integerPredicate.test(i))
                System.out.println(i);
        }
    }
}
