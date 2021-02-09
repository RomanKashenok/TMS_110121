package com.tms.inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal vaska = new Cat("Vaska", "Main kun");
        Animal remi = new Dog("Remi", "decorative");

        Animal[] myPets = new Animal[2];
        myPets[0] = vaska;
        myPets[1] = remi;


        for (int i = 0; i < myPets.length; i++) {
            if(myPets[i] instanceof Cat) {
                ((Cat)myPets[i]).jump(5, "chear");
            } else if(myPets[i] instanceof Dog) {
                ((Dog)myPets[i]).jump();
            } else {
                myPets[i].voice();
            }
        }


    }
}
