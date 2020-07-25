package com.company.java8.streams;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExamples {

    //java 8 wprowadzila Optional
    //czyli opakowanie na obiekt
    //gdzie w srodku obiektu moze byc lub jest pusto

    public static void main(String[] args) {


        Human human = new Human("Jan", "Kowalski", 35);
        Human humanNull = null;

        Optional<Human> humanOptional = Optional.empty(); //pusty kontener na obiekt Human
        Optional<Human> humanOptional1 = Optional.of(human); //kontener towrzony na niepustym obiekcie, jak jest null to wyrzuci wyjatkiem NPE (null pointer exception)
        Optional<Human> humanOptional2 = Optional.ofNullable(human);  //kontener tworzony na ( byc moze pustym) obiekcie, jak jest null to tez ok, nie bedzie NPE (null pointer exception)


        //czy w optionalu jest jakos wartosc z klasy  Human
        if (humanOptional.isPresent()) {
            System.out.println("obiekt niepusty");
            humanOptional.get();

        }else {
            System.out.println("obiekt pusty, nie ma co pobrac");
        }

        System.out.println(human.getName());
//      System.out.println(humanNull.getName()); rzuca NPE


        //czym sie rozni ArrayList od LinkedList
        //dodawanie nowych elementow na koncu listy
        //dodawanie nowych elementow w dowolnym miejscu listy
        List<Human> humanList = new LinkedList<>();
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);

        System.out.println("-----co znalezlismy-----");
        String found = humanList.stream()
                .filter(el -> "Jan".equalsIgnoreCase(el.getName()))
                .findFirst() //optional Human
                .map(x -> x.getName())
                .orElse("Nikt");
        System.out.println(found);

        System.out.println("-----Jan czy Anna-----");
        Human foundButGetElse = humanList.stream()
                .filter(el -> "Jan".equalsIgnoreCase(el.getName()))
                .findFirst() //optional Human
                .orElse(getHuman("Anna", "German", 44));
        System.out.println(foundButGetElse);

        System.out.println("===Jan czy Anna vol 2===");
        Human foundOrElseGet = humanList.stream()
                .filter(el-> "JAN".equalsIgnoreCase(el.getName()))
                .findFirst() // optional od Human
                .orElseGet(() -> getHuman("Anna", "German", 44));
        System.out.println(foundOrElseGet);

        Optional<Human> optionalHuman = getOptionalHuman("Maria", "Janiak", 22);
        if(optionalHuman.isPresent()) {
            System.out.println("someone inside box");
            Human humanfromBox = optionalHuman.get();

        }
    }
    private static Human getHuman(String name, String surname, int age) {
        System.out.println("-----Adding default human-----");
        return new Human(name, surname, age);
    }
    //crtl+alt+m     shift+F6
    private static Optional<Human> getOptionalHuman(String name, String surname, int age) {
        return Optional.ofNullable(getHuman(name, surname, age));



    }
}


