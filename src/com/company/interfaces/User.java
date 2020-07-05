package com.company.interfaces;

public class User implements Gaming, Coding { //nie mozna laczyc wiecej niz 2 klasy ale interfejsy juz tak
    String game;

    public User(String game) {
        this.game = game;
    }

    @Override
    public void plejdagejm() {
        System.out.println("Playing " + game);
    }

    @Override
    public void code(String language) {
        System.out.println("Coding in language " + language);
    }
}
