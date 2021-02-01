package by.tms.boxing;

import com.sun.jndi.ldap.ext.StartTlsResponseImpl;

public class BoxUnboxExmaple {

    public static void main(String[] args) {

        SalaryCalculator sc = new SalaryCalculator();

        byte b;     // 0
        short s;    // 0
        int i;      // 0
        long l;     // 0

        double d;   // 0
        float f;    // 0

        Byte bb;    // null
        Short sb;   // null
        Integer ib; // null
        Long lb;    // null

        Double db;  // null
        Float fb;   // null

//        Number [] arr = new Number[] {1, 2.55, 4.5};
//
//        double result = 1;
//
//        for (int j = 0; j < arr.length; j++) {
//            result *= arr[j].intValue();
//        }
//        System.out.println(result);

        int arg1 = 100;
        Integer arg2 = 5;

        int result = arg1 + arg2;
        Integer result2 = arg1 + arg2;

        // 1 - из Integer достается его value (примитив)
        // 2 - произволится сложение двух примитивов
        // 3 - записывается новое значение value


        int q1 = 1;
        int q2 = 1;

        Integer w1 = 1;
        Integer w2 = 1;

        multiply(q1, q2);
        multiply(w1, w2);

        //Vasya
        int vasyasSalary = 1000;
        System.out.print("У вася зарплата: ");
        System.out.println(vasyasSalary);
        System.out.print("Выдать васе на руки: ");
        System.out.println(sc.calcSalary(vasyasSalary));


    }

    public static void multiply(int a, int b) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        int result = 1;
        for (int i = 0; i < 100_000; i++) {
            result += (a+b);
        }
        System.out.println(System.currentTimeMillis()- start);
    }

    public static void multiply(Integer a, Integer b) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        int result = 1;
        for (int i = 0; i < 100_000; i++) {
            result += (a+b);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
