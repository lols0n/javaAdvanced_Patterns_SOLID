package com.company;

public class TruckCar extends Car {

    private int capacity;

    public TruckCar(int capacity) {
        System.out.println("konstruktor klasy truckcar");
        //tak naprawde jest tu super();
        this.capacity = capacity;
    }
}
