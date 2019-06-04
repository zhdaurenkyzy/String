package _java._se._03._locale;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatWithLocale {
    public static void main(String[] args) {
        double number = 9876.598;
        NumberFormat cfGer = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat cfNor = NumberFormat.getCurrencyInstance(new Locale("no", "NO"));
        NumberFormat cfUs = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(": " + cfGer.format(number));
        System.out.println(": " + cfNor.format(number));
        System.out.println(": " + cfUs.format(number));


    }
}
