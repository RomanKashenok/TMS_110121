package com.tms.clonning;

public class HumanRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car mazda = new Car("MAZDA", "626", "RED");
        Human vasya = new Human(30, "Вася", "MP7463548", mazda);

        System.out.println("Вася:      " + vasya);
        Human clone = vasya.clone();
        System.out.println("Клон Васи: " + clone);

        clone.getCar().setBrand("Mini");
        clone.getCar().setColor("PINK");
        clone.getCar().setModel("Cooper");


        System.out.println("Вася:      " + vasya);
        System.out.println("Клон Васи: " + clone);

        clone.setPassport("NONE");

        System.out.println("Вася:      " + vasya);
        System.out.println("Клон Васи: " + clone);
    }
}
