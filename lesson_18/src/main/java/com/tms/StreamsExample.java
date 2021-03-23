package com.tms;

import com.tms.model.Car;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    private static Random rand = new Random();

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Car c = new Car();
            c.setBrand(RandomStringUtils.random(10, true, true));
            c.setModel(RandomStringUtils.random(10, true, true));
            c.setEngineCapacity(rand.nextDouble() * 4 + 1.0);
            cars.add(c);
        }

        System.out.println(cars);

        long start = System.currentTimeMillis();
        List<String> filteredModifiedCars = cars.parallelStream()
                .filter(car -> car.getEngineCapacity() >= 1.0 && car.getEngineCapacity() <= 2.0 && car.getModel().contains("3") && car.getModel().contains("4"))
                .map(car -> car.getModel())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("spent time: " + (System.currentTimeMillis() - start));

        System.out.println(filteredModifiedCars);
    }
}
