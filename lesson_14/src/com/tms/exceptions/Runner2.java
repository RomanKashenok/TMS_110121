package com.tms.exceptions;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner2 {
    static String username;
    static String password;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
//        try {
//            username = args[0];
//            password = args[1];
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Exception cached: " + ex.getMessage());
//            Thread.sleep(1000);
//            forceToEnterUsernameAndPassword();
//        }
//        System.out.println(username);
//        System.out.println(password);

//        try {
//            callInRecursion(username);
//        } catch (Error err) {
//            System.out.println("Что-то пошло не так!");
//        }
//        System.out.println("Завершение программы!");
//
//        forceToEnterUsernameAndPassword();

    }

    private static void callInRecursion(String username) {
        callInRecursion(username);
    }

    private static void forceToEnterUsernameAndPassword() {
        boolean dataFilled = false;
        while (!dataFilled) {
            System.out.println("Enter username");
            username = sc.nextLine();
            System.out.println("Enter password");
            password = sc.nextLine();

            if(username != null && username.toCharArray().length > 0
            && password != null && password.toCharArray().length > 0) {
                dataFilled = true;
            }
        }
    }
}
