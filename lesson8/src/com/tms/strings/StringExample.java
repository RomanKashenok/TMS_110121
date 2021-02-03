package com.tms.strings;

public class StringExample {
    public static void main(String[] args) {

        String s1 = "test";
        String s2 = new String("test");
        String s3 = new String(new char[]{'t', 'e', 's', 't'});
        String s4 = new String("test");
        String s5 = s4.intern();


//        System.out.println(s1 == s2); // false
//        System.out.println(s1 == s3); // false
//        System.out.println(s1 == s4); // false
//        System.out.println(s1 == s5); // true - false

//        System.out.println(s2 == s3); // false
//        System.out.println(s2 == s4); // true     false
//        System.out.println(s2 == s5); // false
//
//        System.out.println(s3 == s4); // false
//        System.out.println(s3 == s5); // false
//
//        System.out.println(s4 == s5); // false

    }
}
