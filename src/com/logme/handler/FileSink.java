package com.logme.handler;

import com.logme.format.LogFormatter;
import com.logme.format.ColoredFormatter;
import com.logme.log.Level;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileSink implements Sink {

    Level level;
    LogFormatter formatter;
    String fileName;
    PrintWriter writer;

    public FileSink(String fileName) throws IOException {
        this.level = Level.INFO;
        this.formatter = new ColoredFormatter();
        this.fileName = fileName;
        this.writer = new PrintWriter(fileName, "UTF-8");
    }

    @Override
    public void finalize(){
        this.writer.close();
    }

    public Writer getWriter() {
        return writer;
    }

    @Override
    public void setFormatter(LogFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public LogFormatter getFormatter() {
        return this.formatter;
    }

    @Override
    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }

    @Override
    public void publish(String log) throws IOException{
        writer.println(log);
        writer.flush();
    }
}
