package com.company.javaAdvenced.basics;

import static com.company.javaAdvenced.threads.ThreadsColor.ANSI_BLUE;

public class OtherThread extends Thread {

    @Override
    public void  run() {
        //tu dajemy kod do wwywolania w osobnym watku
        System.out.println(ANSI_BLUE + currentThread().getName());
        System.out.println(ANSI_BLUE + "Another thread in action!");
        try {
            sleep(4000);
            System.out.println("enough sleeping back to work");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "i couldn't sleep enough");
        }

    }
}
