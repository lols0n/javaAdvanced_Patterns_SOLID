package com.company.java8.functionalinterfaces;

public class Bird implements Movable{

    private String birdName;

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    @Override
    public String move() {
        return birdName + " is flying";
    }
}
