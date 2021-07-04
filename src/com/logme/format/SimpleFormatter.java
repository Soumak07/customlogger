package com.logme.format;

import com.logme.log.LogRecord;

public class SimpleFormatter extends LogFormatter {

    @Override
    public String format(LogRecord log) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(log.getLevel());
        stringBuilder.append(" ");
        stringBuilder.append(log.getDate());
        stringBuilder.append(" ");
        stringBuilder.append(log.getLogName());

        stringBuilder.append(" ");
        stringBuilder.append(log.getLog());

        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
