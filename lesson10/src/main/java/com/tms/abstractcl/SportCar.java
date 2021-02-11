package com.tms.abstractcl;

public class SportCar extends Car {

    private String model;

    public SportCar(String model) {
        this.model = model;
    }

    @Override
    public void horn() {
        System.out.println("Beep beeep");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "model='" + model + '\'' +
                super.toString() +
                '}';
    }
}
