package com.epam.onboarding.practise.java8;

public interface DefaultMethodsDemo {
    void add();

    default void m1(){
        System.out.println("Default method 1");
    }

    default void m2(){
        System.out.println("Default method 2");
    }
}
