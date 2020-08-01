package com.company.javaAdvenced.collections.comparing;

import com.company.javaAdvenced.collections.Car;

import java.util.Comparator;

public class CarComparedByEngine implements Comparator<Car> {

    //Comparator do porownywania innego niz naturalny porzadek
    //albo do porownan jednorazowych za pomoca klasy anonimowej

    @Override
    public int compare(Car car, Car t1) {
        return car.getEngine() //w tym miejscu mam silnik car1
                //i ten string "silnik car1" jest porownywany z "silnik car2
                .compareTo(t1.getEngine());
    }

}
