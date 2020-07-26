package com.company.homeworks.one;

public abstract class Vehicle implements Transport{

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
