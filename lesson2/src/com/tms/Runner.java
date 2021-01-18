package com.tms;

public class Runner {

    public static void main(String [] args) {

        // целочисленные
        byte b = 30;        // 8 -> -128 -127
        short s = 30;       // 16
        int in = 30;        // 32
        long l = 30;        // 64


        // с плавающей точкой (дробные)
        float fl = 5;       // 32
        double d = 5;       // 64

        // BigDecimal -> use for precision calculations

        //логические
        //true - false

        boolean t = true;
        boolean f = false;
        boolean x3 = 5 > 8;
//        System.out.println(x3);

        //Строковые
        String s1;
        String test = "Hello World";
        String empty = "";
        String aString = "a";
        String test2 = new String("Hello World");
        String test3 = String.valueOf(new char[]{'H', 'E', 'L', 'L', 'O'});
        String test4 = String.valueOf(new char[]{' '});

        //Символьные
        char c = 'c';

        int result = c + 220;

        s1 = "skfbvfkbv";

        s1 = "My name is Roma";
        s1 = s1 + " Kashanok";

        String s2 = "Test";
//        compareStrings();

        encodeMyPassword("teachMeSkills123");
    }

    public static void compareStrings() {
        String username1 = "User";
        String username2 = new String("User");
        String username3 = username2.intern();

        if (username1 == username3) {
            System.out.println("Вы успешно вошли!");
        } else {
            System.out.println("Я вас не звал, идите ...");
        }
    }

    public static void encodeMyPassword(String password) {
        System.out.println("Raw password: " + password);
        byte[] passwordBytes = password.getBytes();
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < passwordBytes.length; i++) {
            char encodedChar = (char) (passwordBytes[i] + 1);
            sbResult.append(encodedChar);
        }
        System.out.println(sbResult.toString());
    }
}
