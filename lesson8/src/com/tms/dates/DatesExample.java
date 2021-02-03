package com.tms.dates;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DatesExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date birthDate = new Date(91, 01, 01);

        System.out.println(birthDate);

        Calendar cal = new GregorianCalendar();

        System.out.println(cal);
        System.out.println(cal.getTime());
        System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("RU", "ru")));

    }
}
