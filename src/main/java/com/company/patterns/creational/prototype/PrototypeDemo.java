package com.company.patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {

        //template
        ShoppingList shoppingList = new ShoppingList();

        //shoppings today
        try {
            ShoppingList shoppingListToday = (ShoppingList) shoppingList.clone();
            List<String> todayShoppings = shoppingListToday.getShoppings();
            todayShoppings.add("piwo");
            todayShoppings.add("kielbaski");
            shoppingListToday = new ShoppingList(todayShoppings);
            shoppingListToday.getShoppings()
                    .stream()
                    .forEach(System.out::println); //soutc

            System.out.println("Zakupy szablon:");
            shoppingList.getShoppings()
                    .stream()
                    .forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
