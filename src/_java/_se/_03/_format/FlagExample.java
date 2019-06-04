package _java._se._03._format;
import java.util.Formatter;

public class FlagExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        int i1 = 17;
        double d1 = 16.78967;
        formatter.format("1. (%%o) %o%n", i1);
        formatter.format("2. (%%a) %a%n", d1);
        formatter.format("3. (%%x) %x%n", i1);

        formatter.format("4. (%%#o) %#o%n", i1);
        formatter.format("5. (%%#a) %#a%n", d1);
        formatter.format("6. (%%#x) %#x%n", i1);
        System.out.println(formatter);

    }
}
