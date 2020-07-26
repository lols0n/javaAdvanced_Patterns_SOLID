package com.company.serialization;

import java.io.*;

public class SerializationMain {

//    Serializacja to wbudowany mechanizm zapisywania obiektów, który pozwala na binarny zapis całego drzewa obiektów.
//    Oznacza to tyle, że jeśli mamy obiekt X, który posiada referencję do obiektu Y to serializując X również Y zostanie
//    automatycznie zapisany w strumieniu wyjściowym.
//
//    Tak zapisany obiekt możesz później otworzyć przy kolejnym uruchomieniu programu. Jednak serializacja ma więcej zastosowań.

    public static void main(String[] args) throws IOException {

        SerialPerson person = new SerialPerson(22,"Jan", "Kowalski", 24);
        SerialPerson person1 = new SerialPerson(21,"Jacek", "Kowal", 25);

        try {
            FileOutputStream fout = new FileOutputStream("SerializedPerson.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(person);
            oos.writeObject(person1);
            oos.close();
            fout.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
