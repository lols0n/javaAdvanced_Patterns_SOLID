package com.company.javaAdvenced.maps;

import com.company.javaAdvenced.collections.Car;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

    public static void main(String[] args) {

    Car car1 = new Car("Volvo", "Diesel", 180);
    Car car2 = new Car("Ford", "Gasoline", 190);
    Car car3 = new Car("BMW", "Diesel", 240);
    Car car4 = new Car("Fiat", "Gasoline", 150);

    //mapa(klucz, waartosc)
        Map<String , Car> mapOfCarsByName = new HashMap<>();
        mapOfCarsByName.put(car1.getName(), car1);
        mapOfCarsByName.put(car2.getName(), car2);
        mapOfCarsByName.put(car3.getName(), car3);
        mapOfCarsByName.put(car4.getName(), car4);


        //iterowanie po mapie#1
        mapOfCarsByName.values(); //zwraca zestaw wartosci
        System.out.println("\n print from map by values");
        for (Car value : mapOfCarsByName.values()) {
            System.out.println(value);
        }

        //iterowanie po mapie#2
        System.out.println("\n print from map by keyset  ");
        mapOfCarsByName.keySet(); //zwraca zestaw kluczy
        for (String s : mapOfCarsByName.keySet()) {
            System.out.println("Map key " + s);
            System.out.println(mapOfCarsByName.get(s));
        }

        System.out.println("\n  print from map by entryset");
        mapOfCarsByName.entrySet(); //zwraca zestaw wpisow
        for (Map.Entry<String, Car> carEntry : mapOfCarsByName.entrySet()) {
            System.out.println("Key :" + carEntry.getKey());
            System.out.println(carEntry.getValue());

            }

        //klucz musi byc unikalny wiec pod kluczem ponizej nastepuje podmiana wartosci
        //czyli obiektu Car
        mapOfCarsByName.put(car1.getName(), new Car("Volvo V50", "Diesel", 220));
        mapOfCarsByName.put(car3.getName(), car3);

        System.out.println("\n print from map by values after swap");
        for (String key : mapOfCarsByName.keySet()) {
            System.out.println("Key is: " + key);
            System.out.println(mapOfCarsByName.get(key));
        }

        mapOfCarsByName.remove("Fiat"); //usuwa po wartosci
        mapOfCarsByName.remove("Volvo", car1); //usuwa po kluczu i wartosci

        System.out.println("\n print from map after remove");
        for (String key : mapOfCarsByName.keySet()) {
            System.out.println("Key is: " + key);
            System.out.println(mapOfCarsByName.get(key));
        }

        if (mapOfCarsByName.containsKey("BMW")) {
            System.out.println("\nBMW on there");
        }
        if (mapOfCarsByName.containsValue(car2)) {
            System.out.println("car2 on there \n" + car2);
        }

        mapOfCarsByName.isEmpty();
        mapOfCarsByName.size();



}

}
