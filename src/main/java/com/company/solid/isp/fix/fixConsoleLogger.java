package com.company.solid.isp.fix;

public class fixConsoleLogger  implements Logger {

    @Override
    public void writeMessage(String  message) {
        System.out.println("Writing new message " + message + " to console");
    }
}
