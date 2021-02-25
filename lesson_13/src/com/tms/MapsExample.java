package com.tms;

import com.tms.figures.Circle;
import com.tms.figures.Shape;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {

        Map<Shape, Byte> nameAgeMap = new HashMap<>();

        Circle roma = new Circle(1, "Roma");
        Circle karina = new Circle(2, "Karina");
        Circle ilya = new Circle(3, "Ilya");

        nameAgeMap.put(roma, (byte)36);
        nameAgeMap.put(karina, (byte)22);
        nameAgeMap.put(ilya, (byte)24);

        Set<Shape> shapes = nameAgeMap.keySet();

        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            System.out.println(nameAgeMap.get(iterator.next()));
        }


    }
}
