package com.company.threads.notifer;

import java.util.Random;

import static com.company.threads.ThreadsColor.ANSI_PURPLE;

public class Reader implements Runnable {

    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String lastestMessage = message.read();
        lastestMessage != "EOF";
        lastestMessage = message.read()) {

            System.out.println(ANSI_PURPLE + "odczytano " + lastestMessage);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
