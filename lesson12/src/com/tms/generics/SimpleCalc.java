package com.tms.generics;

public class SimpleCalc {

    public  <T extends Number> void printArgs(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }

}
