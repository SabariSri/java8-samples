package com.epam.onboarding.practise.java8;

public interface DefaultMethodsDemo2 {
    void add();

    default void m1(){
        System.out.println("Default method 1 - Dupe");
    }

    default void m2(){
        System.out.println("Default method 2 - Dupe");
    }
}
