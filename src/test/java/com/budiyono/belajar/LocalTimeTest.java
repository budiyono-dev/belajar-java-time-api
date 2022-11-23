package com.budiyono.belajar;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void createLocalTimeTest() {

        // mandatory hour and minutes

        LocalTime now = LocalTime.now();
        LocalTime of = LocalTime.of(10, 15, 10);
        LocalTime parse = LocalTime.parse("08:15:30");

        System.out.println("now = " + now);
        System.out.println("of = " + of);
        System.out.println("parse = " + parse);
    }

    @Test
    void manipulateLocalTimeTest() {
        // check localDate
        LocalTime now = LocalTime.now();
        LocalTime time7 = now.withHour(7);

        LocalTime timePlus2 = now.plusHours(2);

        System.out.println("now = " + now);
        System.out.println("time7 = " + time7);
        System.out.println("timePlus2 = " + timePlus2);
    }

    @Test
    void getTimeTest() {
        LocalTime time = LocalTime.now();

        System.out.println("time = " + time);

        int hour = time.getHour();
        System.out.println("hour = " + hour);

        int minute = time.getMinute();
        System.out.println("minute = " + minute);

        int second = time.getSecond();
        System.out.println("second = " + second);

        int nano = time.getNano();
        System.out.println("nano = " + nano);
    }
}
