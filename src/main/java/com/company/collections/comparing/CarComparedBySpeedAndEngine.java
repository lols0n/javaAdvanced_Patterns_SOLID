package com.company.collections.comparing;
import com.company.collections.Car;

import java.util.Comparator;


public class CarComparedBySpeedAndEngine implements Comparator<Car> {

    @Override
    public int compare(Car car, Car t1) {
        if (car.getMaxSpeed() != t1.getMaxSpeed()) {
            return car.getMaxSpeed() - t1.getMaxSpeed();
        }
        return car.getEngine().compareTo(t1.getEngine());
    }


}
