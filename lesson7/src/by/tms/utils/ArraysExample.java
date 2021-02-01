package by.tms.utils;

import by.tms.namegen.repository.NamesPartRepository;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        NamesPartRepository npr = new NamesPartRepository();
        for (int i = 0; i < npr.firstNames.length; i++) {
            System.out.println(npr.firstNames[i]);
        }

        System.out.println("*****************");

        Arrays.sort(npr.firstNames);

        for (int i = 0; i < npr.firstNames.length; i++) {
            System.out.println(npr.firstNames[i]);
        }

        int sad = Arrays.binarySearch(npr.firstNames, "Грустный");

        System.out.println("sad index: " + sad);

        String[] copied = Arrays.copyOfRange(npr.firstNames, 3, 5);

        for (int i = 0; i < copied.length; i++) {
            System.out.println(copied[i]);
        }

    }
}
