package _java._se._03._locale;

import java.text.NumberFormat;
import java.util.Locale;
import java.text.ParseException;

public class NumAndCurParser {
    public static void main(String[] args) throws ParseException {
        String numGer = "9.876,598";
        String curGer = "9.876,60 €";
        NumberFormat nfGer = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat cfGer = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        double dGer = (Double)nfGer.parse(numGer);
        double dcGer = (Double)cfGer.parse(curGer);
        System.out.println(dGer + " " + dcGer);



    }
}
