package com.company.javaAdvenced.exceptions;

public class ThrowMyExceptionSample {

    private void myExceptionCatcher() {
        int a = 1;
        String  b = "AAA";
        if (a == 1) {
            b = "CCC";
        }
        throw new MyException("AAAAAA, blad!");
    }

    private void myExceptionPasser() {
     myExceptionCatcher();
    }

    public static void main(String[] args) {
        ThrowMyExceptionSample sample = new ThrowMyExceptionSample();

        sample.myExceptionPasser();
    }

}
