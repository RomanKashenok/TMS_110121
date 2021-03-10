package com.tms;

import java.util.*;

public class ThreadRunner {
    public static PostOffice post = new PostOffice(new Pen("Red"));

    public static void main(String[] args) throws InterruptedException {
        List<Thread> clientsQueue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            clientsQueue.add(new Thread(new PostClient()));
        }
        System.out.println("there are " + clientsQueue.size() + " waiting for post office opening");
        Thread.sleep(3000);


        System.out.println("Post office open!");

        for (Thread postClient : clientsQueue) {
            postClient.start();
        }

        System.out.println("Post office closed!");





        //1. Создание экземпляра класса потока и вызов метода start()
        //2. Создание экземпляра класса потока и передача ему исполняемого
        // кода (Runnable) и вызов метода start()
    }
}
