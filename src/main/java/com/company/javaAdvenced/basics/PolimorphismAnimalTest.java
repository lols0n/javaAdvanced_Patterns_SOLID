package com.company.javaAdvenced.basics;

import com.company.javaAdvenced.abstraction.AbstractionAnimal;
import com.company.javaAdvenced.abstraction.Bee;
import com.company.javaAdvenced.abstraction.Bird;
import com.company.javaAdvenced.abstraction.Penguin;

public class PolimorphismAnimalTest {

    public static void main(String[] args) {
        Bee bee = new Bee();
        bee.move();
        bee.hibernate();

        Penguin penguin = new Penguin();
        penguin.move();
        //polymorph
        AbstractionAnimal animal = new Bee();
        animal.move();
        //wywolanie metody specyficznej dla Bee
        //wymaga tzw. rzutowania
        ((Bee) animal).hibernate();

        animal = new Penguin();
        animal.move();

        //nie zadziala Bee bee3 = new AbstractionAnimal();

        AbstractionAnimal animal2 = new Penguin();
        animal2.move();

        AbstractionAnimal animal3 = new Bird();
        animal3.move();

        AbstractionAnimal[] abstractionAnimals;
    }

}
