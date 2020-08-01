package com.company.javaAdvenced.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class TestFi {

    public static void main(String[] args) {

        Movable human = new Traveler("Jan Kowalski");
        Movable eagle = new Bird("white eagle");

        System.out.println(human.move());
        System.out.println(human.moveAlone(" to work"));

        System.out.println(eagle.move());
        System.out.println(eagle.moveAlone(" last one"));

        List<Movable> moveables = new ArrayList<>();
        moveables.add(human);
        moveables.add(eagle);
        for (Movable movable : moveables)
            System.out.println(movable.move());

    }
}
