package com.company.encapsulation;

public class PersonExtended extends Person {

    Person person;

    void process() {
        //dostep do public i protected z person
        //protected bo rozszerzamy klase person
        this.LastName = "Nowak";
        //nie zobaczymy tu pola package private z Person
    }

}
