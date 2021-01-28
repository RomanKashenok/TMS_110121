package com.lesson6.classes;

import java.util.Random;

public class Engine {

    public double capacity;
    public String fuelType;

    public void startStop(Car car) {
        Random rand = new Random();
        if(rand.nextBoolean()) {
            System.out.println(car.brand + " Stopping engine");
        } else {
            System.out.println(car.brand + " *****Starting engine");
        }
    }

    public String toString() {
        return "Engine{" +
                "capacity=" + this.capacity +
                ", fuelType='" + this.fuelType + '\'' +
                '}';
    }
}
