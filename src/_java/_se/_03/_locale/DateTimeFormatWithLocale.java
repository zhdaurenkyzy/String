package _java._se._03._locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatWithLocale {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dfUSLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        DateFormat dfUSShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println(dfUSLong.format(date));
        System.out.println(dfUSShort.format(date));
    }
}
