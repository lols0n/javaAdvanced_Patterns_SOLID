package com.company.javaAdvenced.abstraction;

public class Bird extends AbstractionAnimal {

    @Override// musi byc przez abstrakcje w klasie animal
    public void move() {
        System.out.println("bird is flying");
    }
}
