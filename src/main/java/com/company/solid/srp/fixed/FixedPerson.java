package com.company.solid.srp.fixed;



public class FixedPerson {
    private String name;
    private String surname;
    private int age;

    public FixedPerson(String name, String surname) {
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

}

