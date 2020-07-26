package com.company.solid.isp;

import java.util.Collection;

public interface Logger {

    void writeMessage(String message);
    Collection<String> readMessages();
}
