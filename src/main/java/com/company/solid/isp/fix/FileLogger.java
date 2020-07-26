package com.company.solid.isp.fix;

import java.util.Collection;
import java.util.Collections;

public class FileLogger implements ReadableLogger {

    @Override
    public Collection<String> readMessages() {
        return Collections.EMPTY_SET;
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Writing new message " + message + " to file");
    }
}
