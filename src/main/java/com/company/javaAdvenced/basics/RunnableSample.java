package com.company.javaAdvenced.basics;

import static com.company.javaAdvenced.threads.ThreadsColor.ANSI_RED;

public class RunnableSample implements Runnable {

    @Override
    public void run() {

        System.out.println(ANSI_RED + "Runnable sample working as well");
    }
}
