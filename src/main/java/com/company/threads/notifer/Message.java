package com.company.threads.notifer;

import static com.company.threads.ThreadsColor.ANSI_BLUE;
import static com.company.threads.ThreadsColor.ANSI_GREEN;

public class Message {
    private String content;
    private boolean empty;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_GREEN + "blad odczytu");
            }
        }
        System.out.println(ANSI_GREEN + "wiadomosc odczytana wiec moge przekazac kolejna");
        System.out.println(content);
        empty = true;
        notifyAll();
        return content;
    }

    public synchronized void write(String newContent) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_BLUE + "bland zapisu");
            }
        }
        System.out.println(ANSI_BLUE + "wiadomosc zapisana wiec moge zapisac nowa");
        System.out.println(ANSI_BLUE + newContent);
        empty = false;
        this.content = newContent;
        notifyAll(); //powiadom wszystkie inne watki ze skanczylem robote
        //notify(); //powiadom 1 losowy watek
    }
}
