package com.cycles;

public class CycleRunner {
    public static void main(String[] args) throws InterruptedException {

        String borisov = "Borisov"; // distance km
        int distance = 750;
        boolean isArrived = false;

        // 1 - начальная точка
        // 2 - конечная точка
        // 3 - счетчик (как часто нужно спрашивать)

        int anchorDistance = 50;

        for (int km = 0; km <= distance; km += anchorDistance) {
            System.out.print("Спрашиваю в " + km + " раз. ");
            System.out.println("Мы уже приехали в " + borisov);
            for (int pipiCounter = 0; pipiCounter < anchorDistance; pipiCounter += 10) {
                System.out.println("Хочу в туалет!!!");
                Thread.sleep(100);
            }
            Thread.sleep(100);
        }

        System.out.println("**********************************");

        // while(boolean condition) {...}
        // do {...} while(boolean condition)
        int km = 0;
        do {
            km += anchorDistance;
            System.out.print("Спрашиваю в " + km + " раз. ");
            System.out.println("Мы уже приехали в " + borisov);
            Thread.sleep(100);
            if(km == 750) break;
        } while (method1() && method2());


        System.out.println("ПРограмма завершена!");
    }

    private static boolean method1() {
        return false;
    }
    private static boolean method2() {
        return true;
    }
}
