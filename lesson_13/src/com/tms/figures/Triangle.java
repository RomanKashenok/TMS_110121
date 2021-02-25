package com.tms.figures;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
