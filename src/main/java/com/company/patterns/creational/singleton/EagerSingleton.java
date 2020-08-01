package com.company.patterns.creational.singleton;

public class EagerSingleton { //extends java.lang.Object jest domyslenie
    private static final EagerSingleton ES_INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.printf(" utworzony obiekt klasy " + EagerSingleton.class.getName());
    }

    public static EagerSingleton getInstance() {
        System.out.printf("Jestem w getInstance()");
        return ES_INSTANCE;
    }
}
