package com.company.homeworks.two;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankMain {

    public static void main(String[] args) {

        Bank bank = new Bank("Pekao");


       ArrayList listOfClients = new ArrayList();

        Client client = new Client("Jan", "Kowalski", "00000000000", 000);
        Client client1 = new Client("Anna", "Nowak", "00000000010", 001);

        listOfClients.add(client);
        listOfClients.add(client1);

    client.Account("Private", 0);
    client1.Account("Company", 10000);

    ArrayList listOfAccounts = new ArrayList();



    }
}
