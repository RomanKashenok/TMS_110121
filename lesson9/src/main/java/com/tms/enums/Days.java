package com.tms.enums;

public enum Days {

    MONDAY("Monday", "mon", 1),
    TUESDAY("Tuesday", "mon", 2),
    WEDNESDAY("Wednesday", "mon", 3),
    THURSDAY("Thursday", "mon", 4),
    FRIDAY("Friday", "mon", 5),
    SATURDAY("Saturday", "mon", 6),
    SUNDAY("Sunday", "mon", 7);














    String dayFullName;
    String dayName;
    int dayOrdinal;

    Days(String dayFullName, String dayName, int dayOrdinal) {
        this.dayFullName = dayFullName;
        this.dayName = dayName;
        this.dayOrdinal = dayOrdinal;
    }

    public String getDayFullName() {
        return dayFullName;
    }

    public void setDayFullName(String dayFullName) {
        this.dayFullName = dayFullName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public int getDayOrdinal() {
        return dayOrdinal;
    }

    public void setDayOrdinal(int dayOrdinal) {
        this.dayOrdinal = dayOrdinal;
    }
}
