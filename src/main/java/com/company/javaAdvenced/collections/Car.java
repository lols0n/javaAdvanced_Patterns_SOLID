package com.company.javaAdvenced.collections;

import java.util.Objects;

public class Car implements Comparable<Car> {
    //immutable class (zawartosci nie mozna zmienic)

    //Comparable wymusza implementacje  metody compareTo
    //powinien byc stosowany do uzyskania najbardziej naturalnego
    //porzadkowania obiektow

    private String name;
    private String engine;
    private int maxSpeed;

    public Car(String name, String engine, int maxSpeed) {
        this.name = name;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +              //
                ", engine='" + engine + '\'' +        // zapis jednej lini w wielu
                ", maxSpeed=" + maxSpeed +            //
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //sprawdzanie referencji czyli miejsca w pamieci
        //jak to samo miejsce to ten sam obiekt
        if (this == o) return true;

        //jesli obiekt porownywany jest null
        //albo jesli kasy obiektow sa rozne
        //to nie ten sam obiekt
        if (o == null || getClass() != o.getClass()) return false;


        Car car = (Car) o;

        //jak juz powyzsze przeszlo to porownojemy wszystkie pole ktore chcemy
        //brac jako okreslajace nepowtarzalnosc naszego obiektu
        return maxSpeed == car.maxSpeed &&       //
                name.equals(car.name) &&        // zapis jednej lini w wielu
                engine.equals(car.engine);      //
    }

    @Override
    //zwraca niepowtarzalny numer identyfikujacy nasz obiekt
    public int hashCode() {
        //liczony na podstawie hashcodow wskazanych pol  obiektu
        return Objects.hash(name, engine, maxSpeed);
    }

    @Override
    public int compareTo(Car car) {

        return this.maxSpeed - car.getMaxSpeed();
    }
}