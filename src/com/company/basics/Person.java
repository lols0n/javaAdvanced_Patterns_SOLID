package com.company.basics;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class Person {


private String name;
private String surname;
private int age;
private Address address;
private final int ADULT_AGE = 18; //z wielkich liter

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean isAdult() { return age>=ADULT_AGE ? true : false; }
}
