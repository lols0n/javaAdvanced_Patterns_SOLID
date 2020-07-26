package com.company.exceptions;

public class MyException extends IllegalArgumentException { //rozszerzanie wyjatkow w javie

    public MyException(String message) {
        super(message);
    }

    public MyException() {

}



}
