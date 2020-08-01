package com.company.patterns.creational.abstraactFactory;

public class AbstractFordFactoryTest { //wykozystuje sie keidy przewidywane sa zmiany

    public static void main(String[] args) {

    Ford fiesta1 = FordFactory.getFord(
            new FordFiestaFactory("Fiesta 1.1 2022", "1.0 EcoBoost", "winter pack"));
    Ford fiesta2 = FordFactory.getFord(
            new FordFiestaFactory("Fiesta 0.9 2020", "0.9", ""));
    Ford focus1 = FordFactory.getFord(
            new FordFocusFactory("Fiesta 1.6 2020", "1.6 EcoBoost", "winter pack 2"));

        System.out.println(fiesta1.getName() + " " + fiesta1.getAddons());
        System.out.println(fiesta2.getName() + " " + fiesta2.getAddons());
        System.out.println(focus1.getName() + " " + focus1.getAddons());
    }
}
