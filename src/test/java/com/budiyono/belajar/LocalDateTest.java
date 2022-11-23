package com.budiyono.belajar;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    @Test
    void crateLocalDate() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2022, Month.JUNE, 23);
        LocalDate localDate3 = LocalDate.parse("2020-06-23");

        System.out.println("localDate = " + localDate);
        System.out.println("localDate2 = " + localDate2);
        System.out.println("localDate3 = " + localDate3);

    }

    @Test
    void manipulateLocalDate() {
        LocalDate dateNow = LocalDate.now();
        LocalDate dateApril = dateNow.with(Month.APRIL);
        LocalDate dateYear = dateNow.withYear(2030);
        LocalDate date2 = dateNow.withDayOfMonth(1);

        LocalDate dateMei = dateApril.plusMonths(1);
        LocalDate day2 = date2.plusDays(1);

        System.out.println("dateNow = " + dateNow);
        System.out.println("dateApril = " + dateApril);
        System.out.println("dateYear = " + dateYear);
        System.out.println("date2 = " + date2);

        System.out.println("dateMei = " + dateMei);
        System.out.println("day2 = " + day2);
    }

    @Test
    void getDataLocalDateTest() {
        LocalDate date = LocalDate.now();
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
    }
}
