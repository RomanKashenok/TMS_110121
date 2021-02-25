package com.tms;

import com.tms.figures.Circle;
import com.tms.figures.Shape;
import com.tms.figures.Square;
import com.tms.figures.Triangle;

import java.util.HashSet;
import java.util.Set;

public class SetsExample extends Object {
    public static void main(String[] args) {

        Circle roma = new Circle(1, "Roma");
        Circle karina = new Circle(2, "Karina");
        Circle ilya = new Circle(3, "Ilya");

        Set<Shape> shapes = new HashSet<>();
        shapes.add(roma);
        shapes.add(karina);
        shapes.add(ilya);
        shapes.add(null);

        System.out.println(shapes);

    }
}
