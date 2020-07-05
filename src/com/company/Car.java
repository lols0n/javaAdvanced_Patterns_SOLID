package com.company;
// package.com.company.more tu nie widac modyfikatora private
// package.com. tu nie widac modyfikatora private
public class Car {
    private String name;
    private String color;

    public Car() {
        System.out.println("konstruktor bez argomentow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
