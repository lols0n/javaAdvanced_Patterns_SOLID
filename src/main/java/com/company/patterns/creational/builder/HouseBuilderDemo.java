package com.company.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilderDemo {

    public static void main(String[] args) {

        Hause house1 = new  Hause.HauseBuilder("concrete", "wood", "wood").build();

        Hause house2 = new  Hause.HauseBuilder("pustaki", "max", "dachowka")
                .withGarage("wiata")
                .build();

        Hause house3 = new  Hause.HauseBuilder("wylewka", "YTONG", "papa")
                .withGarage("w bryle")
                .withGarden("oczko wodne")
                .build();

        Hause house4 = new  Hause.HauseBuilder("cegla", "cegla", "blacha")
                .withGarden("plac zabaw")
                .build();

        List<Hause> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        //houses.get(0).getGarage().equalsIgnoreCase("aaa");

        houses.stream()
                .forEach(x -> System.out.println(x.getBasement() + ' ' + x.getRoof() + ' ' + x.getGarage() + ' ' + x.getGarden()));

    }

}
