package com.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LogicalOperations {
    public static Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {

//        boolean c = rand.nextInt() >= rand.nextInt();
//        c &= rand.nextInt() > rand.nextInt();
//        System.out.println(c);

        // & - и, | - или
        // && - сокращенное и, || - сокращенное или

//        int age = 14;
//        String name = "Vasya";
//        int res = rand.nextInt(4) + 12;
//        System.out.println("res = " + res);
//
//
//        if (isAdult(age) && isMale(name) && isDrovosek() && age == res) {
//            System.out.println("Добро пожаловать, совершеннолетний мужчина");
//        } else {
//            System.out.println("Зайдите потом несовершеннолетний или женщина");
//        }
//
//
//        boolean result = isAdult(age) ? isDrovosek()  : rand.nextBoolean();

        String s1 = "Hello ";
        String s2 = "world!";
        String s3 = "500" + 100500 + isAdult(21);
        System.out.println(s3);
    }

    public static boolean isAdult(int age) {
        boolean result = age > 17;
        System.out.println("Совершеннолетний: " + result);
        return result;
    }

    public static boolean isMale(String name) throws InterruptedException {
        List<String> names = new ArrayList<>();
        names.add("vasya");
        names.add("petya");
        names.add("kolya");

        boolean result = names.contains(name.toLowerCase());
        Thread.sleep(10000);
        System.out.println("Имя мужское: " + result);
        return result;
    }

    public static boolean isDrovosek() {
        boolean isDrovosek = rand.nextBoolean();
        System.out.println("Дровосек: " + isDrovosek);
        return true;
    }

}
