package com.tms;

public class Operations {
    public static void main(String[] args) throws InterruptedException {

        // +
//        int a = 5;
//        int b = 3;
//
//        int result = a + b;
////        System.out.println(result);
//
//        String firstName = "Raman";
//        String lastName = "Kashanok";
//        String fullName = firstName + " " + lastName;
//
////        System.out.println(fullName);
//
//        result = a - b;
////        System.out.println(result);
//
//        // %
//        int a1 = 4;
//        int a2 = 3;
//        result = a1 / a2;
//        int left = a1 % a2;
//
//        /**
//         * 30 = 7 + 7 + 7 + 7 + 2
//         *
//         * */

//        System.out.println(result);
//        System.out.println(result * a2 + left);
//        System.out.println(left);


        // ++

        int counter = 0;

//        while (true) {
//            counter++; // => counter = counter + 1; => counter +=1;
//            counter = counter + 1;
//            counter +=1;
//            System.out.println(counter);
//            Thread.sleep(1000);
//        }

        // = - присваивания
        // == - оператор равенства (сравнивает ссылки на объекты)

        int a = 5;
        float b = 5.0f;
        String c = "String";
        String d = "String";
        Object e = new Object();

        System.out.println(a == b); // true
        System.out.println(d == c); // true
        System.out.println(d != e); // false

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!" + i);
        }
    }
}
