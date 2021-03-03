package com.tms.exceptions;

import java.util.Scanner;

public class ExceptionThrowingExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IllegalAccessException {

        System.out.println("Enter your age please: \n");
        int age = sc.nextInt();

        checkAgeMethod(age);

        System.out.println("Завершение программы!");
    }

    private static void checkAgeMethod(int age) throws IllegalAccessException {
        if(age < 100) {
            System.out.println("Привет реальый человек!");
        } else {
            throw new IllegalAccessException(String.format("Вы ввели нереальный для Беларуси возраст!!! А именно %d", age));
        }
    }


}
