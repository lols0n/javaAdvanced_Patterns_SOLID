package com.company.javaAdvenced.homeworks.one;

public class Ship extends Vehicle {

    private  boolean oceanic;

    public Ship(String name, boolean oceanic) {
        super(name);
        this.oceanic = oceanic;
    }

    @Override
    public String transportFromTo(String from, String to) {
        return "Water transport starting in: " + from + " going to: " + to;
    }
}
