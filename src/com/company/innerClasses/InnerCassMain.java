package com.company.innerClasses;

public class InnerCassMain {

    public static void main(String[] args) {
        // najperw obiekt zewnetrzny
        CommonCar commonCar = new CommonCar();
        // potem na nim wolamy new dla obiektu klasy zewnetrznej
        CommonCar.Engine engine = commonCar.new Engine();



    }
}
