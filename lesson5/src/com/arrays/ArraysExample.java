package com.arrays;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        Random rand = new Random();
//        printGroupNames();

        // <Type> <var name> [];
        // <Type> [] <var name>;
        // <Type> [] <var name> = new <Type> [];

//        int [] marks = new int[7]; // 224
        int [] marks = new int[7];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(5) + 5;
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }


        System.out.println();
        System.out.println("length of array: " + marks.length);
        System.out.println(marks[0]); // value 7
        System.out.println(marks[1]); // value 6
        //...
        System.out.println(marks[6]); // value 5
    }

    private static void printGroupNames() {
        String name1 = "Vanya";
        String name2 = "Petya";
        String name3 = "Kolya";
        String name4 = "Sveta";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
