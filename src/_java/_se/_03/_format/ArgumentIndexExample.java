package _java._se._03._format;
import java.util.Formatter;

public class ArgumentIndexExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        double d1 = 16.7897;
        formatter.format("%1$e, %<f, %<g, %a\n", d1);
        System.out.println(formatter);

    }
}
