package com.lesson6.classes;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {

        Date date = new Date();

//        Car car1 = new Car();
//        car1.brand = "Mazda";
//        car1.color = "RED";
//        car1.model = "mx3";
//        car1.price = 11000;
//        car1.manufacturedDate = date;
//        car1.engine = new Engine();
//        car1.engine.capacity= 1.6;
//        car1.engine.fuelType = "gasoline";
//        car1.startStop();
//
//        Car car2 = new Car();
//        car2.brand = "Nissan";
//        car2.color = "BLACK";
//        car2.model = "Juke";
//        car2.price = 11000;
//        car2.manufacturedDate = date;
//        car2.engine = new Engine();
//        car2.engine.capacity= 1.6;
//        car2.engine.fuelType = "gasoline";
//        car2.startStop();
//
//        Car car3 = new Car();
//        car3.brand = "Opel";
//        car3.color = "SILVER";
//        car3.model = "Signum";
//        car3.price = 11000;
//        car3.manufacturedDate = date;
//        car3.engine = new Engine();
//        car3.engine.capacity= 2.2;
//        car3.engine.fuelType = "diesel";
//        car3.startStop();

//        car1.horn();
//        car2.horn();
//        car3.horn();

        Car testCar = new Car();
        System.out.println(testCar);

        Car testCar1 = new Car("WV", "passat", "blue");
        System.out.println(testCar1);

        Car testCar2 = new Car("porsche", "cayenne");
        System.out.println(testCar2);
    }
}
