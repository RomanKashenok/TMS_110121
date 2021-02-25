package com.tms.generics.box;

import java.util.ArrayList;
import java.util.List;

public class GBox<T extends Sweet> {

    private List<T> sweetsList = new ArrayList<>();

    public void addSweet(T sweet) {
        sweetsList.add(sweet);
    }

    public T getCandy() {
        return sweetsList.get(0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sweetsList.forEach(it -> sb.append(it.toString() + ", "));
        return sb.toString();
    }
}
