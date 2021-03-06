package com.company.solid.ocp.fix;

public class Logger {

    private MessageLogger messageLogger;

    public Logger(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}
