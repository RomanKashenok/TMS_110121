package com.tms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UnmodifieableAndThreadSafeCollections {
    public static void main(String[] args) throws InterruptedException {

        List<String> sList = new ArrayList<>();

        //НЕИЗМЕНЯЕМАЯ!
//        List<String> strings = Collections.unmodifiableList(sList);
//        strings.add("ТЭСТ");

        //ПОТОКОБЕЗОПАСНАЯ!
        final List<String> strings1 = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sList.add("Q");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sList.add("W");
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sList);
    }
}
