package com.company.javaAdvenced.lists;

import com.company.javaAdvenced.collections.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {

    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "Diesel", 180);
        Car car2 = new Car("Ford", "Gasoline", 190);
        Car car3 = new Car("BMW", "Diesel", 240);
        Car car4 = new Car("Fiat", "Gasoline", 150);

        //definicja wszelkich kolekcji w java 1.6 i nizej
        //List<Car> carArrayList = new ArrayList<Car>();

        //list to interfejs
        //elementy sa w uporzadkowanej kolejnosci
        //mozna pobrac na podstawie indeksu
        //moze zawierac duplikaty
        //arraylist jedna z implementacji oparta o strukture tablicowa

        List<Car> carArrayList = new ArrayList<>();

        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car4);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);

        System.out.println("zawartosc array listy (z powtorzeniami): \n");
        for(Car car : carArrayList) {
            System.out.println(car);
        }

        //linkedlist jedan z implementacji oparta o wezly i  powiazanie miedzy nimi
        System.out.println(" ");
        List<Car> carLinkedList = new LinkedList<>();

        carLinkedList.add(car1);
        carLinkedList.add(car2);
        carLinkedList.add(car4);
        carLinkedList.add(car1);
        carLinkedList.add(car2);
        carLinkedList.add(car3);

        System.out.println("zawartosc linked listy (z powtorzeniami): \n");
        for(Car car : carLinkedList) {
            System.out.println(car);
        }

/*
        kiedy ktora lista

        najczesciej ArrayList bo wiekszosc operacji jak na tabeli

        pobieranie elementu na podstawie indexu jest szybsze w ArrayList 0(1) vs LinkedList 0(n)

        dodawwanie elemantu na koniec struktury jest tak samo szybkie chyba ze dojdzie
        do przepelnienia bufora w ArrayList to wtedy LinkedList bedzie szybsza

        dodawanie na konkretny index jest szybsze dla LinkedList
*/

        //doawanie do listy na konkretny index
        carArrayList.add(3,car1);
        carArrayList.add(2,car4);



        //dodawanie na koniec do add(carX)

        //carArrayList.contains() - sprawdzanie czy element jest na liscie
        carArrayList.remove(3);
        carArrayList.remove(car3);

        System.out.println("\n zawartosc array listy po add i remove: \n");
        for(Car car : carArrayList) {
            System.out.println(car);
        }

        List<List<Car>> listOfListsOfCars;

    }
}