package com.company.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedMain {

    public static void main(String[] args) {
        SerialPerson person = null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("SerializedPerson.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            person = (SerialPerson) ois.readObject(); //rzutowanie z klasy SerialPerson
            System.out.println(person.getAge() + " " + person.getSurname());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
