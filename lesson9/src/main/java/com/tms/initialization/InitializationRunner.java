package com.tms.initialization;

public class InitializationRunner {

    public static void main(String[] args) {
        Child child = new Child();

        /*
         * a = 1, b = 0
         * a = 1, b = 2
         * g = 1, h = 0
         * g = 1, h = 2
         * c = 3, d = 0, e = 5
         * c = 3, d = 4, e = 5, f = 6
         * "Parent constructor"
         * a = 1, b = 2, c = 3, d = 4, e = 5, f = 6
         *
         * i = 3, j = 0, k = 5
         * i = 3, j = 4, k = 5, l = 6
         * "Child constructor"
         * g = 1, h = 2, i = 3, j = 4, k = 5, l = 6
         *
         *
         * */
    }
}