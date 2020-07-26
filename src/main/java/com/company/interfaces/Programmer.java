package com.company.interfaces;

public class Programmer implements OOPCoding {

    @Override
    public void codeOOP(String language) {
        System.out.println("Advenced coding in " + language);
    }

    @Override
    public void code(String language) {
        System.out.println("Coding in " + language);
    }
}