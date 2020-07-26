package com.company.threads.basics;

import static com.company.threads.ThreadsColor.ANSI_RED;

public class RunnableSample implements Runnable {

    @Override
    public void run() {

        System.out.println(ANSI_RED + "Runnable sample working as well");
    }
}
