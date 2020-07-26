package com.company.collections.comparing;

import com.company.collections.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingTest {

    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "Diesel", 180);
        Car car2 = new Car("Ford", "Gasoline", 190);
        Car car3 = new Car("BMW", "Diesel", 240);
        Car car4 = new Car("Fiat", "Gasoline", 150);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        System.out.println("\nDrukujemy liste nieposortowana wg predkosci");
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("\nDrukujemy liste posortowana wg predkosci");
        Collections.sort(carList);
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("\nDrukujemy liste posortowana wg silnika");
        Collections.sort(carList, new CarComparedByEngine());
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("\nDrukujemy liste posortowana wg predkosci i silnika");
        Car car5 = new Car("Volvo", "Gasoline", 180);
        Car car6 = new Car("Ford", "Gasoline + Gas", 190);
        carList.add(car5);
        carList.add(car6);
        Collections.sort(carList, new CarComparedBySpeedAndEngine());
        for (Car car : carList) {
            System.out.println(car);
        }

    }
}
