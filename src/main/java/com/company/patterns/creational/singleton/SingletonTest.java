package com.company.patterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        //najpierw, przy uruchomieniu bedzie utworzony obiekt klasy Eager singleton
        System.out.println("===================");

        EagerSingleton.getInstance();

        LazySingleton.getLsInstance();

        //wolanie innych metod na Singletonach:

        EagerSingleton.getInstance().getYear_2000();
        System.out.println(EagerSingleton.getInstance().getYear_2000());

        EagerSingleton localEagerSingleton = EagerSingleton.getInstance();
        localEagerSingleton.getYear_2000();

    }
}
