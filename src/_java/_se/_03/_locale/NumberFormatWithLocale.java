package _java._se._03._locale;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatWithLocale {
    public static void main(String[] args) {
        double number = 9876.598;
        NumberFormat nfGer = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat nfJap = NumberFormat.getNumberInstance(Locale.JAPANESE);
        NumberFormat nfDef = NumberFormat.getNumberInstance(Locale.FRANCE);
        System.out.println("Formatting the number: " + nfGer.format(number));

    }
}
