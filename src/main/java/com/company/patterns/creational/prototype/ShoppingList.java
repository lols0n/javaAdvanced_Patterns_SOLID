package com.company.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable {
    private List<String> shoppings;

    public ShoppingList() {
        shoppings = new ArrayList<>();
        shoppings.add("ser");
        shoppings.add("chleb");
        shoppings.add("pomidory");
        shoppings.add("masło");
    }

    public ShoppingList(List<String> shoppings) {
        this.shoppings = shoppings;
    }

    public List<String> getShoppings() {
        return shoppings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempShoppings = new ArrayList<>();
        for (String shopping : this.shoppings) {
            tempShoppings.add(shopping);
        }

        return new ShoppingList(tempShoppings);
    }
}

