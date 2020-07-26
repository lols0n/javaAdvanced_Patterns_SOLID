package com.company.solid.isp.fix;

import java.util.Collection;

public interface ReadableLogger extends Logger {

    Collection<String> readMessages();
}
