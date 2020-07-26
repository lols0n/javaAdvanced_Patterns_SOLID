package com.company.java8.functionalinterfaces;

/*java 8 wprowadzila interfejsy funkcyjne
* określaja one ze jest tylko jedna metoda abstakcyjna
* w interfejsie
* ta jedna metode nalezy obsluzyc czyli zaimplementowac
* (inne mozna ale nie trzeba)
*  */

@FunctionalInterface
public interface Movable {

    String move();


    default String  moveWith(String partner) {
        return move() + " " + partner;
    }

    default String moveAlone(String reason) {
        return "traveling alone because of " + reason;
    }

}


