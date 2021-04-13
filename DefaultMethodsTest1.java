package com.epam.onboarding.practise.java8;

public class DefaultMethodsTest1 {

    public static void main(String[] args) {
        DefaultMethodsDemo obj = () -> {
            System.out.println("Lambda with Default methods");
        };
        obj.m1();
        obj.m2();
        obj.add();
    }
}
