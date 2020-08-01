package com.company.javaAdvenced.homeworks.two;

public class Client implements Account {

    private String name;
    private String surname;
    private String  pesel;
    private int clientId;

    public Client(String name, String surname, String pesel, int clientId) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


    @Override
    public void Account(String accountType, int saldo) {

    }
}
