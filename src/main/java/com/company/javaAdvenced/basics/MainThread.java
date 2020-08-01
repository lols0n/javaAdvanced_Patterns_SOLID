package com.company.javaAdvenced.basics;


import static com.company.javaAdvenced.threads.ThreadsColor.*;

public class MainThread { //AKKA

    public static void main(String[] args) {

        //kolejnosc wykonywania watkuw jest nieokreslona
        //na x wywolan mozemy dostac x roznych kolejnosci logu na konsoli
        System.out.println(ANSI_PURPLE + "Main thread in action");
        OtherThread otherThread = new OtherThread();
        otherThread.setName("======Nowy zajefajny osobny watek======");
        //otherThread.run();
        //do uruchomienia nowego watku potrzebana jest metoda start()
        otherThread.start();

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        //watek w klasie anonimowej
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "anonymous class in action too");
            }
        }.start();

        //watek na nadpisanej definicji runnablesample

//        runnableSample = new Thread(new RunnableSample() {
//            @Override
//            public void run() {
//                System.out.println(ANSI_RED + "overwritten runnable sample working");
//            }
//        });
//        runnableSample.start();

        //laczenie watkuw metoda .join

                runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "overwritten runnable sample working");
                try {
                    otherThread.join(); //przejdz do otherthread i wykonaj go zanim
                    //bedziesz kontynuowal z aktualnym runablesample
                    System.out.println(ANSI_RED + "overwritten runnable sample working again");
                } catch (InterruptedException e) { //InterruptedException to wyjatek
                    //jaki moze ale nie musi wystapic przy wykonywaniu
                    //metody join()
                    System.out.println(ANSI_RED + "other thread interrupted");
                }
            }
        });
        runnableSample.start();
        otherThread.interrupt(); //przerwanie sleepa z watku othertread

        System.out.println(ANSI_PURPLE + "end of main");
    }



}
