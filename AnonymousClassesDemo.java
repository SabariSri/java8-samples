package com.epam.onboarding.practise.java8;

public class AnonymousClassesDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++)
                    System.out.println("child thread");
            }
        });
        thread.start();

        for (int i = 0; i < 2; i++)
            System.out.println("main thread");

    }
}
