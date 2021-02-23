package com.tms.generics.box;

public class Candy extends Sweet{
    private String name;

    public Candy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
