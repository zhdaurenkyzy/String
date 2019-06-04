package _java._se._03._locale;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        int data[] = {100, 1000, 10000, 1000000};
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i] + "\t" + nf.format(data[i]));
        }
    }
}
