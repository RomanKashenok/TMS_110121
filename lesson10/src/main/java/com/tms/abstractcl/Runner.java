package com.tms.abstractcl;

import com.tms.interf.Remote;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Car ferrari = new SportCar("F450");
        ferrari.setColor("RED");
        ferrari.setBrand("FERRARI");

        System.out.println(ferrari);

        ferrari.drive();

    }
}
