package com.tms.figures;

public class Square implements Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
