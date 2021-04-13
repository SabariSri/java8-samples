package com.epam.onboarding.practise.java8;

public class DefaultMethodsTest2 implements DefaultMethodsDemo, DefaultMethodsDemo2 {

    public static void main(String[] args) {
        DefaultMethodsTest2 obj = new DefaultMethodsTest2();
        obj.m1();
        obj.m2();
        obj.add();
    }

    @Override
    public void add() {
    }

    @Override
    public void m1() {
        System.out.println("Overridden method 1");
    }

    @Override
    public void m2() {
        DefaultMethodsDemo2.super.m2();
    }
}
