package com.company.threads.notifer;

public class Main {

    public static void main(String[] args) {

        Message message = new Message();

        (new Thread(new Writer(message))).start(); //anonimowe wywolanie watku

        //jawne wywolanie watku
        Thread readerThread = new Thread(new Reader(message));
        readerThread.start();
    }
}
