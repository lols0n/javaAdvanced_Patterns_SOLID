package com.company;

public class CarMain {

    public static void main(String[] args){

        Car car = new Car(); //dla tego obiektu nie ma konstruktora
        TruckCar truckCar = new TruckCar(500); //potrzebny konstruktor
        SportCar sportCar = new SportCar(4);
        FerrariCar ferrariCar = new FerrariCar(5, "california");


        car.setName("bmw");
        car.setColor("bialy");
        truckCar.setName("MAN");
        truckCar.setColor("Najszybszy czerwony");
        sportCar.setColor("czarny");
        sportCar.setName("Mustang");
        ferrariCar.setName("ferrari");
        ferrariCar.getName();



        System.out.println(truckCar.getName() + " " + truckCar.getColor());
        System.out.println(sportCar.getName());
        System.out.println(ferrariCar.getColor());
        System.out.println(ferrariCar.getColor(" to nowy kolor"));
    }
}
