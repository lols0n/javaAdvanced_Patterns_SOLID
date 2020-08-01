package com.company.javaAdvenced.abstraction;

public class Bee extends Worm {

    @Override
    public void hibernate() {
        System.out.println("Winter");
    }

    @Override
    public void move() {
        System.out.println("bee is flying");

    }
}
