package com.tms.model;

public class CarPrinter {

    private static int count = 0;

    public void printCar(Car car) {
        count++;
        System.out.println(car);
    }

    public static int getCount() {
        return count;
    }
}
