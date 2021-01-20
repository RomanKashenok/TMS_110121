package com.tms;

import java.util.Random;

public class ConditionOperators {

    public static Random rand = new Random();

    public static void main(String[] args) {

        // if
        // if - else
        // if - else if ..... - else

        int randomNumber = rand.nextInt(8) + 1;

        System.out.println(randomNumber);
        if (randomNumber == 1) {
            System.out.println("Mon");
        } else if (randomNumber == 2) {
            System.out.println("Tue");
        } else if (randomNumber == 3) {
            System.out.println("Wed");
        } else if (randomNumber == 4) {
            System.out.println("Thu");
        } else if (randomNumber == 5) {
            System.out.println("Fri");
        } else if (randomNumber == 6) {
            System.out.println("Sat");
        } else if (randomNumber == 7) {
            System.out.println("Sun");
        } else {
            System.out.println("Random number is not corresponds to any day of the week!!!");
        }
//
//        if(randomNumber > 0 && randomNumber < 4) {
//            System.out.println("Тяжелые дни");
//            if(randomNumber  > 1) {
//                if(randomNumber != 2) {
//                    System.out.println("Середина недели - среда");
//                }
//            }
//        } else {
//            System.out.println("вторая половина недели");
//        }
//        System.out.println("Program finished successfully!!!");

        // switch-case

        System.out.println(randomNumber);

        switch (randomNumber) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Random number is not corresponds to any day of the week!!!");
        }


    }
}
