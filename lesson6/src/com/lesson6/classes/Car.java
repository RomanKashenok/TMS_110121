package com.lesson6.classes;

import java.util.Date;
import java.util.Random;

public class Car {
    public  String brand;
    public String model;
    public String color;
    public int price;
    public Date manufacturedDate;
    public Engine engine;

    public Car() {
        this.color = "BLACK";
        this.manufacturedDate = new Date();
    }

    public Car(String brand, String model) {
        this();
        this.brand = brand;
        this.model = model;
        this.price = 15000;
        this.engine = new Engine();
        this.engine.fuelType = "gasoline";
        this.engine.capacity = 2.2;
    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = 15000;
        this.manufacturedDate = new Date();
        this.engine = new Engine();
        this.engine.fuelType = "gasoline";
        this.engine.capacity = 2.2;
    }

    public void horn() {
        System.out.println(brand + " " + model + " BEEEP - BEEEP");
    }

    public void startStop() {
        Random rand = new Random();
        engine.startStop(this);
    }

    public String toString() {
        return "Car{" +
                "brand='" + this.brand + '\'' +
                ", model='" + this.model + '\'' +
                ", color='" + this.color + '\'' +
                ", price=" + this.price +
                ", manufacturedDate=" + this.manufacturedDate +
                ", engine=" + this.engine +
                '}';
    }
}
