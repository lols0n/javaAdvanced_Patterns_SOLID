package com.company.java8.functionalinterfaces.bankSample;

public class InterestCounter implements Runnable{

    private  String counter;

    public InterestCounter(String counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(counter + " started counting intrerests for bank customers.");
    }
}
