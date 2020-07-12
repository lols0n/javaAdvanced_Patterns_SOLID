package com.company.homeworks.one;

public class PassengerCar extends Car implements Passenger {

    private int noOfPassengers;

    public PassengerCar(String name, String kind) {
        super(name, kind);
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public int retriveNumberOfPasengers() {
        return noOfPassengers;
    }
}
