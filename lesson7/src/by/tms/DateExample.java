package by.tms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateExample {
    public static void main(String[] args) {

        Date current = new Date();

        System.out.println(current);

        Date tomorrow = new Date(121, 2, 2);

        DateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        String format = df.format(current);
        System.out.println(format);
    }
}
