package com.company.solid.srp;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //metota sprawdzajaca od kiedy mozna dostac prawo jazdy
    //lamie spr bo zmiana logiki jest drugim powodem zmiany klasy
    //odminnym od np dolozenia kolejnego pola
    public boolean canGetDrivingLicense() {
        return age >= 18;
    }
}
