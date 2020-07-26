package com.company.solid.isp;

import java.util.Collection;
import java.util.Collections;

public class FileLogger implements Logger{

    @Override
    public void writeMessage(String message) {
        System.out.println("adding " + message + " to file");
    }

    @Override
    public Collection<String> readMessages() {
        return Collections.EMPTY_LIST;
    }
}
