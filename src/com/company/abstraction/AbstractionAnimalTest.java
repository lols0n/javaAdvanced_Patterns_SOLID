package com.company.abstraction;

import com.company.Person;

public class AbstractionAnimalTest {

    public  static  void  main(String[] args) { //zielona strzalka zeby odpalic tego maina shift+F10

        //to nie zadziala
        //Animal animal = new Animal();

        Bird bird = new Bird();
        bird.move();

        Fish fish = new Fish();
        fish.move();

        Penguin penguin = new Penguin();
        penguin.move();
    }
}
