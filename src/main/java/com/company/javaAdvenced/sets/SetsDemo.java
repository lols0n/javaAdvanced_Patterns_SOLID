package com.company.javaAdvenced.sets;

import com.company.javaAdvenced.collections.Car;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

    public static void main(String[] args) {

        Car car1 = new Car("Volvo","Diesel", 180);
        Car car2 = new Car("Ford","Gasoline", 190);
        Car car3 = new Car("BMW","Diesel", 240);
        Car car4 = new Car("Fiat","Gasoline", 150);

        //set przechowuje zestaw niepowtarzalnych obiektow


        //set to interface
        //hashset to konkretna implementacja
        //najbardziej podstawowa, najczesciej uzywana
        //przechowuje dane nieposortowane, bez gwarancji kolejnosci odczytu
        //przechowywanie przez tabele hashujaca

        Set<Car> cars = new HashSet<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car3);
        cars.add(car1);
        cars.add(car4);

        System.out.println("Dodalem 6 elementow a rozmiar seta to: " + cars.size());
        System.out.println(car1.getEngine());

        for (Car car : cars) { //Car.for tabulator
            System.out.println("Marka: " + car.getName() + " speed: " + car.getMaxSpeed());
        }

        cars.remove(car2);
        System.out.println(" ");

        if(cars.contains(car2)) {
            System.out.println("mialo usunac car2 ale nie usunelo");
        } else {
            System.out.println("car2 usuniete \n");
        }

        //TreeSet zaklada przechowywanie w porzadku naturalnym albo
        //wedlug zadanego Comparatora
        Set<Car> carTreeSet = new TreeSet<>();

        System.out.println("czy set jest pusty " + carTreeSet.isEmpty()+"\n");

//        carTreeSet.add(car1);
//        carTreeSet.add(car2);
//        carTreeSet.add(car1);
//        carTreeSet.add(car3);
//        carTreeSet.add(car4);

        //linkedHashSet pamieta kolejnosc w jakiej obiekty sa wprowadzane do kolekcji
        //elementy sie nie powtarzaja
        Set<Car> linkedCars = new LinkedHashSet<>();

        linkedCars.add(car1);
        linkedCars.add(car2);
        linkedCars.add(car2);
        linkedCars.add(car3);
        linkedCars.add(car4);

        for (Car linkedCar : linkedCars) {
            System.out.println(linkedCar); //toString

        }

        System.out.println(" ");
        System.out.println("wyswietlanie tylko car3 o ile jest \n");
        for (Car linkedCar : linkedCars) {
            if (linkedCar.equals(car3)) {
                System.out.println(linkedCar); //toString

            }
        }
    }
}
