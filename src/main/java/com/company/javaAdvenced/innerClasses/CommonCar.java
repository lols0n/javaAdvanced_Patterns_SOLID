package com.company.javaAdvenced.innerClasses;

public class CommonCar   {

    private String name;

    public String getName() {
        return name;
    }

    class Engine {
        public String  getCarNameFromEngine() {
            // klasa wewnetrzna ma dostep do wszystkich pol klasy zewnetrznej
            // ma tez dostep do wszystkich metod
            return name + getName();

        }

    }

}
