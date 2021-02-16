import java.util.*;

public class Runner {
    public static void main(String [] args) {

//        String s1 = "a_test";
//        String s2 = "b_test";
//        String s3 = "c_test";
//        String s4 = "d_test";
//
//        System.out.println(s3.compareTo(s4));
//
//        List<String> strings = new ArrayList<>();
//
//        strings.add(s2);
//        strings.add(s4);
//        strings.add(s1);
//        strings.add(s3);
//
//        System.out.println(strings);
//
//        Collections.sort(strings);
//
//        System.out.println(strings);

        countMethodrgs(5,4,3,5,3,5,5);

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 3);
        System.out.println(cal.getDisplayName(Calendar.MONTH, Calendar.LONG_STANDALONE, new Locale("ru")));
    }

    private static void countMethodrgs(int arg1) {
        System.out.println("1 arg");
    }
    private static void countMethodrgs(int arg1, int arg2) {
        System.out.println("2 args");
    }
    private static void countMethodrgs(int arg1, int arg2, int ... args) {
        int length = args.length;
        System.out.println(2 + length + " args");
    }
    private static void countMethodrgs(int arg1, int arg2, int arg3) {
        System.out.println("3 args");
    }
}
