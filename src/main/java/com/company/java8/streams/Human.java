package com.company.java8.streams;

import com.company.collections.Car;

import java.util.Comparator;

public class Human implements Comparable<Human> {

    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    //interfejs Comparable wymusza implementacje metody compareTo
    //powinien byc uzyty do szeregowania obiektow w naturalnym porzadku
    public int compareTo(Human human) {
        return this.surname.compareTo(human.getSurname());
    }
}

