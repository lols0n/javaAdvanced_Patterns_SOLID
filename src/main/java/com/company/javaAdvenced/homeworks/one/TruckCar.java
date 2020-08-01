package com.company.javaAdvenced.homeworks.one;


public class TruckCar extends Car implements Freight {

    private int freightWeight;

    public TruckCar(String name, String kind) {
        super(name, kind);
    }

    public int getFreightWeight() {
        return freightWeight;
    }

    public void setFreightWeight(int freightWeight) {
        this.freightWeight = freightWeight;
    }

    @Override
    public int carry() {
        return 0;
    }
}
