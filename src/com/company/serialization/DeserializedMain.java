package com.company.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedMain {

    public static void main(String[] args) {
        SerialPerson person = null;
        SerialPerson person1 = null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("SerializedPerson.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            person = (SerialPerson) ois.readObject(); //rzutowanie z klasy SerialPerson
            System.out.println("Person: \n" + "Wiek: " + person.getAge() + "\n" + "Nazwisko: " + person.getSurname());
            System.out.println(person.toString() + "\n");//samo person tez wywola toString


            person1 = (SerialPerson) ois.readObject(); //rzutowanie z klasy SerialPerson
            System.out.println("Person1: \n" + "Wiek: " + person1.getAge() + "\n" + "Nazwisko: " + person1.getSurname());
            System.out.println(person1.toString());//samo person1 tez wywola toString

            System.out.println("id person: " + person.getId() + " '0' przez transient w klasie SerialPerson");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
