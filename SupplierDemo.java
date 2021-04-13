package com.epam.onboarding.practise.java8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String[] names = {"Test1", "Test2", "Test3", "Test4"};
        Supplier<String> stringSupplier = () -> {
            int randomIndex = (int) (Math.random() * names.length);
            return names[randomIndex];
        };
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
    }
}
