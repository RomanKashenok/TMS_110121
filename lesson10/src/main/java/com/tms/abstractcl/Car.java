package com.tms.abstractcl;

public abstract class Car {

    private String color;
    private String brand;

    protected abstract void horn();

    public void drive() {
        System.out.println("Driving forward");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return ", color='" + color + '\'' +
                ", brand='" + brand;
    }
}
