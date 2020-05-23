package com.oktaliem.hkopendata.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    public static String getCurrentDate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return myDateObj.format(myFormatObj);
    }

    public static String getCurrentTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }

    public static int getCurrentHours() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH");
        return Integer.parseInt(myDateObj.format(myFormatObj));
    }
}
