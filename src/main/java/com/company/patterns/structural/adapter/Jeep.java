package com.company.patterns.structural.adapter;

public class Jeep extends AmericanCar {

    private String name;


    public Jeep(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
