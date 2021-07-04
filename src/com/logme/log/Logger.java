package com.logme.log;

import com.logme.handler.ConsoleSink;
import com.logme.handler.Sink;

import java.io.IOError;
import java.io.IOException;
import java.util.*;

public class Logger implements LoggerInterface {

    private static Map<String, Logger> loggerMap = new HashMap<>();
    private static List<Sink> sinkers = new ArrayList<>();

    String name;
    Level level = Level.INFO;

    public Logger(String name) {
        this.name = name;
        sinkers.add(new ConsoleSink());
    }

    public static final Logger getLogger(String name){

        if(loggerMap.get(name) != null){
            return loggerMap.get(name);
        }

        Logger logger = new Logger(name);
        loggerMap.put(name, logger);

        return logger;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void addSinker(Sink sink){
        this.sinkers.add(sink);
    }

    @Override
    public void log(Level level, String log) throws Exception {
        Logger logger = getLogger(this.name);

        for(Sink sink: this.sinkers){
            if(!(level.ordinal()<=sink.getLevel().ordinal())) continue;
            sink.publish(sink.getFormatter().format(new LogRecord(level, log, java.time.LocalDate.now()+ "--" + java.time.LocalTime.now(),logger.name)));
        }
    }

    @Override
    public void info(String log){

    }

    @Override
    public void severe(String log) {

    }

    @Override
    public void warning(String log) {

    }

    @Override
    public void debug(String log) {

    }

    @Override
    public void error(String log) {

    }

    @Override
    public void fatal(String log) {

    }

}
