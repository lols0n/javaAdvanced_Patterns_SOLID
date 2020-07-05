package com.company.abstraction;

public class Penguin extends Bird {

    @Override
    public void move() {
        System.out.println("Penguin is bird but it deoesnt fly");
    }
}
