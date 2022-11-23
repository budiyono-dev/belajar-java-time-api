package com.budiyono.belajar.legacy;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateAndCalendarTimeZoneTest {
    @Test
    void createDateTest() {
        Date date = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        System.out.println("date = " + date);
        System.out.println("date2 = " + date2);
    }

    @Test
    void createCalendarTest() {
        // create calendar object
        Calendar calendar = Calendar.getInstance();

        // convert to date
        Date date = calendar.getTime();
        System.out.println("date = " + date);
    }

    @Test
    void manipulateCalendarTest() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        Date date = calendar.getTime();
        System.out.println("date = " + date);
    }

    @Test
    void getCalendarDataTest() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("date = " + date);
        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));
        System.out.println("calendar.get(Calendar.MONTH) = " + calendar.get(Calendar.MONTH));
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH) = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("calendar.get(Calendar.WEEK_OF_YEAR) = " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("calendar.get(Calendar.WEEK_OF_MONTH) = " + calendar.get(Calendar.WEEK_OF_MONTH));
    }

    @Test
    void createTimeZone() {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("timeZone = " + timeZone);
        System.out.println("id = " + timeZone.getID());
    }

    @Test
    void availableIDZone() {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String s : availableIDs) {
            System.out.println(s);
        }
    }

    @Test
    void getTimeZone() {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        System.out.println(timeZone.getID());

        TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Jakarta");
        System.out.println(timeZone2.getID());
    }

    @Test
    void timeZoneInCalendar() {
        Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendarJayapura = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jayapura"));

        System.out.println("jakarta = " + calendarJakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println("Papua = " + calendarJayapura.get(Calendar.HOUR_OF_DAY));

        calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("jakarta GMT = " + calendarJakarta.get(Calendar.HOUR_OF_DAY));
    }
}
