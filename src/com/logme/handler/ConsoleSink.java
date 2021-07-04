package com.logme.handler;

import com.logme.format.LogFormatter;
import com.logme.format.ColoredFormatter;
import com.logme.log.Level;

public class ConsoleSink implements Sink {

    Level level;
    LogFormatter formatter;

    public ConsoleSink() {
        this.level = Level.INFO;
        this.formatter = new ColoredFormatter();
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public void setFormatter(LogFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public LogFormatter getFormatter() {
        return formatter;
    }

    @Override
    public void publish(String log) {
        System.out.println(log);
    }
}
