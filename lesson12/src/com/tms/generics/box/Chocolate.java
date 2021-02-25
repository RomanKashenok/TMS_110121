package com.tms.generics.box;

public class Chocolate extends Sweet{
    private String name;

    public Chocolate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
