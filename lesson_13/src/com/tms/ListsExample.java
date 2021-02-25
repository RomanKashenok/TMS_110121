package com.tms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String name = "Test name";
        names.add("Vasya");
        names.add("Kolya");
        names.add(name);
        names.add(name);
        names.add(name);
        names.add(name);
        names.add(name);
        names.add(name);
        names.add(name);
        names.add(name);

        System.out.println(names);

        names.remove(2);


        List<String> linkedNames = new LinkedList<>();
        linkedNames.add("Vasya");
        linkedNames.add("Kolya");
        linkedNames.add(name);
        linkedNames.add(name);
        linkedNames.add(name);
        linkedNames.add(name);
        linkedNames.add(name);

        System.out.println(linkedNames);


    }
}
