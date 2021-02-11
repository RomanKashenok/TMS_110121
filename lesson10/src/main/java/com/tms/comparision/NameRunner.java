package com.tms.comparision;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.*;

public class NameRunner {
	public static void main(String[] args) {

		List <Human> scoolClass = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            scoolClass.add(new Human(RandomStringUtils.randomAlphabetic(4, 15), RandomUtils.nextInt(150, 190)));
        }
        scoolClass.forEach(System.out::println);








        Collections.sort(scoolClass, (h1, h2) -> h1.getHeight() - h2.getHeight());

        System.out.println("***********************************8");
        scoolClass.forEach(System.out::println);











//        Collections.sort(scoolClass);
//
//        System.out.println("***********************************8");
//        scoolClass.forEach(System.out::println);

    }
}
