package com.company.io.simple;


import java.io.*;
import java.util.Scanner;

public class ReadWriteFile {


    public void simpleWriteToFile(String filename) {
        try
            (FileWriter writer = new FileWriter(filename)){
                writer.write("simple line 1\n");
                writer.write("simple line 2");
            } catch(IOException e){
                e.printStackTrace();
            }


        }

        public void simpleReadFromFile(String filename) {
            try {
                Scanner scanner = new Scanner(new FileReader(filename));
                scanner.useDelimiter("\n");
                System.out.println("Reading file " + filename);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
                scanner.close();//zamykanie zasobow
            } catch(FileNotFoundException e){
                    e.printStackTrace();
                }

        }

    public static void main(String[] args) {

        String firstFile = "First file";
        ReadWriteFile rwf = new ReadWriteFile();
        rwf.simpleWriteToFile(firstFile);

        rwf.simpleReadFromFile(firstFile);
        rwf.writeWithBuffer("BufferedContent.txt");
        System.out.println("Read from buffer: ");
        rwf.readWithBuffer("BufferedContent.txt");
    }

    public void writeWithBuffer(String filename) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write("Buffered line 1 \n");
            writer.write("Buffered line 2");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readWithBuffer(String filename) {
        String input;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
