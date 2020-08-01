package com.company.javaAdvenced.basics;

public class CarMain {

    public static void main(String[] args){

        Car car = new Car(); //dla tego obiektu nie ma konstruktora
        TruckCar truckCar = new TruckCar(500); //potrzebny konstruktor
        SportCar sportCar = new SportCar(4);
        FerrariCar ferrariCar = new FerrariCar(5, "california");


        car.setName("bmw");
        car.setColor("white");
        truckCar.setName("MAN");
        truckCar.setColor("Najszybszy czerwony");
        sportCar.setColor("Black");
        sportCar.setName("Mustang");
        ferrariCar.setColor("niebieski");
        ferrariCar.setName("ferrari");
        ferrariCar.getName();


        System.out.println(car.getColor());
        System.out.println(truckCar.getName() + " " + truckCar.getColor());
        System.out.println(sportCar.getName());
        System.out.println(ferrariCar.getColor());
        System.out.println(ferrariCar.getColor(" to nowy kolor"));
        //test super.getColor()
        System.out.println(ferrariCar.getModel() + " " + ferrariCar.getOriginalColor());
    }
}
