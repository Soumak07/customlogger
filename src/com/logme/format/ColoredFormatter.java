package com.logme.format;

import com.logme.log.LogRecord;
import com.logme.utility.ConsoleColors;

public class ColoredFormatter extends LogFormatter {

    @Override
    public String format(LogRecord log){
        StringBuilder stringBuilder = new StringBuilder();

        if(log.getLevel().ordinal()<=1){
            stringBuilder.append(ConsoleColors.RED);
        }else if(log.getLevel().ordinal()<=3){
            stringBuilder.append(ConsoleColors.YELLOW);
        }else{
            stringBuilder.append(ConsoleColors.GREEN);
        }

        stringBuilder.append(log.getLevel());
        stringBuilder.append(" ");
        stringBuilder.append(log.getDate());
        stringBuilder.append(" ");
        stringBuilder.append(log.getLogName());

        stringBuilder.append(" ");
        stringBuilder.append(log.getLog());

        stringBuilder.append(ConsoleColors.RESET);
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
