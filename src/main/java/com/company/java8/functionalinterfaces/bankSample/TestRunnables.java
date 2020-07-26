package com.company.java8.functionalinterfaces.bankSample;

import java.util.LinkedList;
import java.util.List;

public class TestRunnables {

    public static void main(String[] args) {
        Runnable mailSender = new MailSender("PREZES");
        Runnable raportGen = new RaportGenerator("Outsource Company");
        Runnable counter = new InterestCounter("Standard interest counter");

        ((MailSender) mailSender).addAddress(" ksiegowy ");
        ((MailSender) mailSender).addAddress(" informatyk ");
        ((MailSender) mailSender).addAddress(" recepcja ");
        ((MailSender) mailSender).addAddress(" administracja ");

        List<Runnable> runnables = new LinkedList<>();
        runnables.add(mailSender);
        runnables.add(raportGen);
        runnables.add(counter);

        for (Runnable runnable : runnables) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
