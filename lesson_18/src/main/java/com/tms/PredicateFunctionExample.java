package com.tms;

import com.tms.model.Car;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateFunctionExample {
    public static void main(String[] args) {
        Car car = new Car("mazda", "mx3", 1.6);
        Car car2 = new Car("mazda", "cx7", 2.5);
        Car car3 = new Car("nissan", "Juke", 1.6);

        // Check if eng capacity less than 2.0

        System.out.println(car + " match requirements: " + checkCarOnMatchRequirements(car, (c) -> c.getEngineCapacity() < 2.0));
        System.out.println(car2 + " match requirements: " + checkCarOnMatchRequirements(car2, (c) -> c.getEngineCapacity() < 2.0));
        System.out.println(car3 + " match requirements: " + checkCarOnMatchRequirements(car3, (c) -> c.getEngineCapacity() < 2.0));

        System.out.println("***************** Function example");

        Function<Car, String> carFunc =  (c) -> c.getModel() + " " + c.getEngineCapacity();

        System.out.println(getModelAndCapacityWithFunction(car, carFunc));
        System.out.println(getModelAndCapacityWithFunction(car2, carFunc));
        System.out.println(getModelAndCapacityWithFunction(car3, carFunc));

        System.out.println("************** Car supplier/consumer example");

        Supplier<Car> carSupplier = () -> new Car();
        Car car4 = carSupplier.get();
        System.out.println(car4);

        Consumer<Car> carConsumer = (c) -> {
            c.setBrand("default brand");
            c.setModel("default model");
            c.setEngineCapacity(1.0);
        };
        carConsumer.accept(car4);

        System.out.println(car4);


    }

    public static boolean checkCarOnMatchRequirements(Car car, Predicate<Car> predicate) {
        return predicate.test(car);
    }

    public static String getModelAndCapacityWithFunction(Car car, Function<Car, String> func) {
        return func.apply(car);
    }
}
