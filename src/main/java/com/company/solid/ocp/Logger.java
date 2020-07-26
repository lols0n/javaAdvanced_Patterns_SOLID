package com.company.solid.ocp;

import static com.company.solid.ocp.LogDestination.CONSOLE;

public class Logger {

    private LogDestination destination;

    public Logger(LogDestination destination) {
        this.destination = destination;
    }

    public void log(String message) {
        switch (destination) {
            case CONSOLE:
                System.out.println("Writing " + message + " to console!");
                break;
            case DB:
                System.out.println("Saving " + message + " to database table");
                break;
            default:
                throw new IllegalArgumentException("Not supported logging type");
        }
    }
}
