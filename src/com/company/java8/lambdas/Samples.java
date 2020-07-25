package com.company.java8.lambdas;

public class Samples {

    public static void main(String[] args) {

        //pre java 8
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Doing some stuff multithread!");
            }
        });

        thread.start();


    //since java 8
    //() -> {}
    //(args) -> {work on args}
    Thread threadNew = new Thread(() -> {
        System.out.println("doing some other stuff multithread!!");
    });

    threadNew.start();

    //lambdas
        // (jakies argumenty) - zero albo wiecej, mozna podac typy ale nie koniecznie
        //-> operator pomiedzy lista argumentow a wykonaniem
        // {jakas akcja} - wykonywana akcja (metoda, proces)
        String argument1 = "aaa";
        String argument2 = "bbb";
        StringAdding adding = (arg1, arg2) -> { return argument1 + " " + argument2;};
        StringAdding addingWitchTypes = (arg1, arg2) -> { return argument1 + " " + argument2;};


    }

}
