package com.company.patterns.creational.abstraactFactory;

public class FordFactory {
    public static Ford getFord(FordAbstractFactory factory) {
        return factory.createFord();
    }
}
