package com.swadhe.springboot.LearnJPAHibernate.course.springdatajpa;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class dateTimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        ZoneId d = ZoneId.
                systemDefault();
        System.out.println(d);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2026);
        int year = calendar.getWeekYear();
        System.out.println(year);

        int hour= calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        int minute=calendar.get(Calendar.MINUTE);
        System.out.println(minute);

        boolean islenient= calendar.isLenient();
        System.out.println(islenient);

        calendar.setLenient(
                true
        );


    }
}
