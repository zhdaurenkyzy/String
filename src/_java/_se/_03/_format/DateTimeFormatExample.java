package _java._se._03._format;
import java.util.Formatter;
import java.util.Calendar;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("%tr", calendar);
        System.out.println(formatter);

    }
}
