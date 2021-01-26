package com.arrays;

import java.util.Random;

public class MultiArraysExample {
    public static void main(String[] args) {

//        Random rand = new Random();
//
//
//        int [][] marks = new int[3][];
//
//        // 0 - Vasya
//        // 1 - Valya
//        // 2 - Petya
//
//        marks[0] = new int[4];
//        marks[1] = new int[3];
//        marks[2] = new int[5];
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                marks[i][j] = rand.nextInt(50) + 50;
//            }
//        }
//
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j < marks[i].length; j++) {
//                System.out.print(marks[i][j] + " ");
//            }
//            System.out.println();
//        }


        char [][] arr = new char[7][7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(j<= i) {
                    arr[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }

    }
}
