package com.epam.onboarding.practise.java8;

import com.epam.onboarding.exercise.java8.Employee;

@FunctionalInterface
public interface CustomFunctionalInterface {
    Employee getDetails(String name, int account, int salary);
}
