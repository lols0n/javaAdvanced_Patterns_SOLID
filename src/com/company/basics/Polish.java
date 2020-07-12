package com.company.basics;

//dziedziczenie przez slowo extends
public class Polish extends Person {

    private boolean hasKDR;



    public Polish(String name, String surname, int age) {
        super(name, surname, age);

    }

    public Polish(String name, String surname, int age, boolean hasKDR) {
        super(name, surname, age);
        this.hasKDR = hasKDR;
        }

    }

