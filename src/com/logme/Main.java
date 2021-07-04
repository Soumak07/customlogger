package com.logme;

import com.logme.format.SimpleFormatter;
import com.logme.handler.FileSink;
import com.logme.handler.Sink;
import com.logme.log.Level;
import com.logme.log.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        try {
            logger.log(Level.ERROR, "System has crashed");
            logger.setLevel(Level.ERROR);

            logger.log(Level.INFO, "System is back up");
            logger.log(Level.FATAL, "System failed to restart");

            Sink newSink = new FileSink("application.log");
            newSink.setFormatter(new SimpleFormatter());
            logger.addSinker(newSink);

            logger.log(Level.SEVERE, "System has crashed and logged in new file");
            logger.log(Level.SEVERE, "System going to restart again");

        }catch (Exception e){
            System.out.println("Logging failed");
        }
    }
}
