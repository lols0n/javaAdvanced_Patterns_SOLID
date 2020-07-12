package com.company.homeworks.one;

public interface Transport {

    default String transportFromTo(String from, String to) { //default - domyslna postac dla kazdej klasy
        return "Transport start from: " + from + " goes to: " + to;
    }
}
