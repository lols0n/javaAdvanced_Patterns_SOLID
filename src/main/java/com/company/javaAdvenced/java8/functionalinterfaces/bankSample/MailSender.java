package com.company.javaAdvenced.java8.functionalinterfaces.bankSample;

import java.util.ArrayList;
import java.util.List;

public class MailSender implements Runnable{

private String senderName;

private List<String> addresses;

    public MailSender(String senderName) {
        this.senderName = senderName;
        addresses = new ArrayList<>();
    }

    public void addAddress(String address) {
        addresses.add(address);
    }

    @Override
    public void run() {
        System.out.println("Start sending mails!");
        for (String address : addresses) {
            System.out.println(senderName + " Sending mail to " + address);
        }
    }
}
