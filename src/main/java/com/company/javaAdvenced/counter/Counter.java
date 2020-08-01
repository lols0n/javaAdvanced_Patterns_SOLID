package com.company.javaAdvenced.counter;

import static com.company.javaAdvenced.threads.ThreadsColor.*;

public class Counter {
    private int i;

    public void performCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ANSI_CYAN;
                break;
            case "Thread2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_BLUE;
        }

        //ma sie wykonac dla calosci danego watku
        //bez mozliwosci przerwania wykonania przez inny watek
        //analogcznie dla metody zdeklarowanej jako synchronized:
//        synchronized (this) { // lub w metodzie
            doRealCounting(color);
 //       }
    }

    private synchronized void doRealCounting(String color) {
        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + " i= " + i);
        }
    }
}
