package com.company.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExceptionSample {
    public void  sleepRhread() throws InterruptedException {
        Thread.sleep(5);
    }

    public void sleepThreadAndReadFile() throws InterruptedException, FileNotFoundException {
        Thread.sleep(5);
        new FileReader("aaa.abc");
    }

    public void sleepThreadAndReadFileCommon() throws Exception {
        Thread.sleep(5);
        new FileReader("aaa.abc");
    }

    public void sleepThreadEx1() throws InterruptedException {
        Thread.sleep(5);
    }
    //zestaw do obslogi 2 roznych wyjatkow
    public void readFileEx2() throws InterruptedException {
        Thread.sleep(5);
    }

    public void  sleepAndRead() throws Exception {
        sleepThreadEx1();
        readFileEx2();
    }
}
