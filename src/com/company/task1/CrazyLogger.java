package com.company.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 * Created by Ira on 18.01.2016.
 */
public class CrazyLogger {
    private StringBuilder stringBuilder = new StringBuilder();


    public void appendMessage(String message) {
        String str = getTimeFormat() + message + ";";
        stringBuilder.append(str);

    }

    private String getTimeFormat() {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        formatter.format("%td-", date);
        formatter.format("%tm-", date);
        formatter.format("%tY : ", date);
        formatter.format("%tH-", date);
        formatter.format("%tM - ", date);
        return formatter.toString();
    }

    public void showLogInfo() {
        String logBuffer = stringBuilder.toString();
        String[] tmpStr = logBuffer.split(";");
        for (String tmpStrI : tmpStr) {
            System.out.println(tmpStrI + ";");
        }
       // System.out.println(stringBuilder);

    }

    public boolean findMessageBySubstring(String message) {
        String logBuffer = stringBuilder.toString();
        if (logBuffer.contains(message)) {
            String[] tmpStr = logBuffer.split(";");
            for (String tmpStrI : tmpStr) {
                if (tmpStrI.contains(message)) {
                    System.out.println(tmpStrI);
                }
            }
            return true;

        }
        return false;
    }


}
