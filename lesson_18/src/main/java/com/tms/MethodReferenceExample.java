package com.tms;

import com.tms.model.Car;
import com.tms.model.CarPrinter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    private static Random rand = new Random();

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        CarPrinter cp = new CarPrinter();

        for (int i = 0; i < 1000; i++) {
            Car c = new Car();
            c.setBrand(RandomStringUtils.random(10, true, true));
            c.setModel(RandomStringUtils.random(10, true, true));
            c.setEngineCapacity(rand.nextDouble() * 4 + 1.0);
            cars.add(c);
        }

        cars.parallelStream()
                .filter(car -> car.getEngineCapacity() >= 1.0 && car.getEngineCapacity() <= 2.0 && car.getModel().contains("3") && car.getModel().contains("4"))
                .peek(cp::printCar);
    }
}
