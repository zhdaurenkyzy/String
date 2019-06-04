package _java._se._03._format;

import java.util.Formatter;
import java.util.Timer;

public class SimpleFormatExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        boolean b1 = true;
        boolean b2 = false;
        formatter.format("1. - %b, %b\n", b1, b2);
        System.out.print(formatter);
        System.out.println("-------------------------------------");
        Timer t = new Timer();
        formatter.format("2. - %h", t);
        System.out.println(formatter);
        System.out.println(Integer.toHexString(t.hashCode()));
    }

}
