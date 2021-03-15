package com.tms.synchroniation.old;

import java.util.concurrent.locks.ReentrantLock;

public class CounterRunner {

    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        Counter counter = new Counter();
        Object mutex = new Object();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                lock.lock();
//                synchronized (mutex) {
                    try {
                        counter.count = 1;
                        for (int j = 0; j < 5; j++) {
                            Thread.sleep(100);
//                            synchronized (counter) {
                            System.out.printf("Thread %s modified counter. Current count = %d, ineration: %d \n",
                                    Thread.currentThread().getName(), counter.count, j);
                            counter.increment();
//						 }
                        }
                    } catch (Exception e) {
                    }finally {
                        lock.unlock();
                    }
//                }
            }).start();
        }

    }
}
