package com.tms.interf;

public interface Remote {

    int a = 10;

    public abstract void turnOn() throws InterruptedException;
    void turnOff() throws InterruptedException;

    static void staticFunction() {
        System.out.println("from static function. a = " + a);
    }

    default void specialFunction() {
        System.out.println("Special function activated!!!");
    }
}
