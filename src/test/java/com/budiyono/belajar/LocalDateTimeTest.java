package com.budiyono.belajar;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    @Test
    void create() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.JUNE, 7, 12, 45);
        LocalDateTime localDateTime2 = LocalDateTime.parse("2020-12-12T11:45");

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println("localDateTime2 = " + localDateTime2);
    }

    @Test
    void manipulateLocalDateTimeTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.withYear(2020);

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime1 = " + localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.plusMonths(1);
        System.out.println("localDateTime2 = " + localDateTime2);
    }

    @Test
    void getLocalDateTimeTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
    }

    @Test
    void convertLocalDateTimeToLocalDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDate = " + localDate);
    }

    @Test
    void convertLocalDateToLocalDateTime() {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = localDate.atTime(12, 45);
        
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);
    }

    @Test
    void convertLocalDateTimeToLocalTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalTime localTime = localDateTime.toLocalTime();

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localTime = " + localTime);

        localTime.atDate()

    }
}
