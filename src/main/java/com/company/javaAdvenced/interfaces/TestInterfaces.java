package com.company.javaAdvenced.interfaces;

public class TestInterfaces {

    public static void main(String[] args) {


        User user = new User("Witcher 3 Wild Hunt");

        user.plejdagejm();
        user.code("C#");


        Coding coder = new User("RDR2");
        coder.code("Java");
        ((User)coder).plejdagejm();


    }
}
