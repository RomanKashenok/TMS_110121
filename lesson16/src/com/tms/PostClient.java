package com.tms;

public class PostClient implements Runnable {
    @Override
    public void run() {
        Pen postPen = ThreadRunner.post.getPostPen();
        synchronized (postPen) {
            try {
                for (int i = 0; i < 5; i++) {
                    System.err.println("Client " + Thread.currentThread().getName() + " writing " + i
                            + " with " + postPen);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
