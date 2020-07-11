package com.company.abstraction;

import com.company.Person;
import javafx.animation.Animation;

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

        Ant ant = new Ant();
        ant.move();
        ant.hibernate();


    }
}
