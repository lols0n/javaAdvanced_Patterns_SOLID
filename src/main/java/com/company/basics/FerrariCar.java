package com.company.basics;

public class FerrariCar extends SportCar {
    private String  model;


    public FerrariCar(int acceleration, String model) {
        super(acceleration); //dziedziczy po klasie SportCar
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override //podmienia kolor z klasy Car
    public String getColor() {
        return "red";
    }


    public String getColor(String addon) { //podmienia kolor i umozliwia dodanie tekstu
        return "red" + addon;

   }
    //wywolanie metody z nadklasy przez super
    public String getOriginalColor() {
        return super.getColor();

    }
}
