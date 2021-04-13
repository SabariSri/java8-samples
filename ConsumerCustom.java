package com.epam.onboarding.practise.java8;

import java.util.function.Consumer;

public class ConsumerCustom {
    public static void main(String[] args) {
        Consumer<ConsumerEmployee> consumer1 = (employee) -> {
            System.out.println("Employee no " + employee.employeeNo);
        };

        Consumer<ConsumerEmployee> consumer2 = (employee) -> {
            System.out.println("Employee name " + employee.employeeName);
        };

        Consumer<ConsumerEmployee> chainedConsumer = consumer1.andThen(consumer2);

        ConsumerEmployee employee = new ConsumerEmployee(1234,"Sri");
        chainedConsumer.accept(employee);

    }
}
