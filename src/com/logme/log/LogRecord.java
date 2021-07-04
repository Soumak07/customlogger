package com.logme.log;

import java.util.Date;

public class LogRecord {

    Level level;
    String log;
    String date;
    String logName;

    public LogRecord(Level level, String log, String date, String logName) {
        this.level = level;
        this.log = log;
        this.date = date;
        this.logName = logName;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }
}
