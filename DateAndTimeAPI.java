package com.epam.onboarding.practise.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        int dayOfMonth = localDate.getDayOfMonth();
        int monthValue = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println(dayOfMonth + "/" + monthValue + "/" + year);

        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int seconds = localTime.getSecond();

        System.out.println(hour + ":" + minute + ":" + seconds);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        LocalDate dob = LocalDate.of(1994,06,23);
        Period age = Period.between(localDate,dob);
        System.out.println(age);
    }

}