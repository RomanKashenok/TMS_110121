package com.lesson6;

import java.util.Random;

public class ArraysExceptionsExample {
    public static void main(String[] args) {

        String [] names = new String[4];

        String [] namesInitialized = new String[] {"Vasya", "Petya", "Kolya", "Sveta"};

//        for(String s : names) {
//            System.out.println(s.toUpperCase());
//        }

        try {
            for (int i = 0; i <= namesInitialized.length; i++) {
                System.out.println(namesInitialized[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за пределы массива");
        }

        System.out.println("Программа завершена успешно!!!");

    }
}
