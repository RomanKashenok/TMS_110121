package com.tms.generics.box;

public class Runner {
    public static void main(String[] args) {
        GBox<Candy> candyBox = new GBox();
        Candy sweet1 = new Candy("Коровка");
        Candy sweet2 = new Candy("Аленка");
        Chocolate sweet3 = new Chocolate("Dove");

        candyBox.addSweet(sweet1);
        candyBox.addSweet(sweet2);

        GBox<Chocolate> chocoBox = new GBox();
        Chocolate sweet4 = new Chocolate("Ritter sport");

        chocoBox.addSweet(sweet3);
        chocoBox.addSweet(sweet4);


        System.out.println(candyBox);
        System.out.println(chocoBox);
    }
}
