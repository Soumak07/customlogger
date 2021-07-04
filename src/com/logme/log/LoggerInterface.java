package com.logme.log;

public interface LoggerInterface {
    void log(Level level,String log) throws Exception;
    void info(String log);
    void severe(String log);
    void warning(String log);
    void debug(String log);
    void error(String log);
    void fatal(String log);
}
