package com.company.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FordMustangBaseFactory {
    private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();
    public static FordMustangBase getMustangBase(String color, String engine) {
        FordMustangBase fordMustangBase;
        System.out.println(FordMustangBaseFactory.class + " getMustangBase");
        if(fordMustangBaseSet.size() > 0) {
            System.out.println("Base set size > 0");
            fordMustangBase = fordMustangBaseSet.stream()
                    .filter(f->color.equals(f.getColor()) && engine.equals(f.getEngine()))
                    .peek(s -> System.out.println(s.getEngine() + " " + s.getColor()))
                    .findAny()
                    .orElseGet(() -> getFordMustangBase(color, engine));
        }else {
            System.out.println("Base set size = 0, creating new");
            fordMustangBase = getFordMustangBase(color, engine);
        }
        fordMustangBaseSet.add(fordMustangBase);
        return fordMustangBase;
    }
    private static FordMustangBase getFordMustangBase(String color, String engine) {
        return new FordMustangBase(color, engine);
    }
    public static Set<FordMustangBase> getFordMustangBaseSet() {
        return fordMustangBaseSet;
    }
}
