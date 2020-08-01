package com.company.patterns.creational.singleton;

public class EagerSingleton { //extends java.lang.Object jest domyslenie

    public final int YEAR_2000 = 2000; // przypisywanie liczby do zmiennej w celu szybkiej podmiany
    private final int MINIMUM_SALARY = 2000;

    private static final EagerSingleton ES_INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println(" utworzony obiekt klasy " + EagerSingleton.class.getName());
    }

    public static EagerSingleton getInstance() {
        System.out.println("Eager Singleton w getInstance()");
        return ES_INSTANCE;
    }

    public int getYear_2000() {
        return  YEAR_2000;
    }
}
