package com.tms;

public class VarCasting extends Object {
    public static void main(String[] args) {

        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;

//         byte res1 = s;
         byte res1 = (byte)s;
//         byte res2 = i;
         byte res2 = (byte)i;
//         byte res3 = l;
         byte res3 = (byte)l;

         short res4 = b;
         short res5 = (short)i;
         short res6 = (short)l;

         int res7 = b;
         int res8 = s;
         int res9 = (int)l;

         long res10 = b;
         long res11 = s;
         long res12 = i;
    }
}
