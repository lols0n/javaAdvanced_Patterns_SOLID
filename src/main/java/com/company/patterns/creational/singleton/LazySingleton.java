package com.company.patterns.creational.singleton;

public class LazySingleton { //nie wykorzystuje sie przy wielowoatkowosci

    private static LazySingleton LS_INSTANCE;

    private LazySingleton() {
        System.out.println("Lazy singleton initialized " + LazySingleton.class.getName());
    }

    public static LazySingleton getLsInstance() {
        System.out.println("Lazy singleton getInstance() called");
        if(LS_INSTANCE == null) {
            LS_INSTANCE = new LazySingleton();
        }
        return LS_INSTANCE;
    }
}
