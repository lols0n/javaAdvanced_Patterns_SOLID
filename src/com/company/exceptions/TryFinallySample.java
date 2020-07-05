package com.company.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFinallySample {

    public void readFile(String filename) throws IOException {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } finally {
            // finally i try zawsze sie wykonuje
            //kolejny try/catch tutaj to antypatern
            // wskazane jest rzucenie wyjatku z metody
            reader.close();
        }

    }
    public void readFileWithResources(String filename) {
        //try-with-resources
        //od javy 1.7
        //dziala jak kazdy zasob zdefinoiowany w try()
        //jest automatycznie zamykany na koncu bloku try-catch
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {

        } catch (FileNotFoundException ex) {
            //lapiemy wyjatek z filereader
        } catch (IOException ex){
            //lapiemy wyjatek z BufferedReader
        }
    }// try-with-resources zwalnia z konczenia strumieni
}
