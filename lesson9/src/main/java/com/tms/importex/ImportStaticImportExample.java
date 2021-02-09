package com.tms.importex;


import com.tms.obj.Box;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ImportStaticImportExample {
    public static void main(String[] args) {

        Box b1 = new Box("Red", 2,2,2);
//        System.out.println(b1);
//        System.out.println(Days.MONDAY);
//        System.out.println(new Meeting(Days.SUNDAY, 45));


        int a = 3;

        System.out.println(pow(a, 3));

        System.out.println(sqrt(pow(a,5)));

        System.out.println(PI);

    }
}
