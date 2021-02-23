package com.tms.annotations.service;

import com.tms.annotations.ann.Profileable;

import java.util.Random;

@Profileable(desc = "AnnotationDemoService class with public, private and protected methods")
public class AnnotationDemoService {

    private final Random rand = new Random();

    @Profileable(desc = "First PUBLIC method from AnnotationDemoService")
    public void method1() throws InterruptedException {
        Thread.sleep(rand.nextInt(3000));
    }

    @Profileable(desc = "Second PRIVATE method from AnnotationDemoService", execute = true)
    private void method2() throws InterruptedException {
        Thread.sleep(rand.nextInt(3000));
    }

    @Profileable(desc = "FiThird PROTECTED method from AnnotationDemoService")
    protected void method3() throws InterruptedException {
        Thread.sleep(rand.nextInt(3000));
    }

}
