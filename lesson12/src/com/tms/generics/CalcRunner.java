package com.tms.generics;

public class CalcRunner {
    public static void main(String[] args) {

        SimpleCalc calc = new SimpleCalc();

        Integer ai = 5;
        Integer bi = 5;
        Double ad = 5.0;
        Double bd = 5.0;

        calc.printArgs(ai, bi);
        calc.printArgs(ad, bd);

        // wildcard
    }
}
