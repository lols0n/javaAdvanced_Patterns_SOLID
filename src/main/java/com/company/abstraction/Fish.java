package com.company.abstraction;

public class Fish extends AbstractionAnimal {


    @Override//musi byc przez abstrakcje w klasie animal

    public void move() {
        System.out.println("fish is swimming");
    }
}
