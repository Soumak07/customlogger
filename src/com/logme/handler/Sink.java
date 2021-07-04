package com.logme.handler;

import com.logme.format.LogFormatter;
import com.logme.log.Level;

public interface Sink {

    void setFormatter(LogFormatter formatter);
    LogFormatter getFormatter();

    void setLevel(Level level);
    Level getLevel();

    void publish(String log) throws Exception;
}
