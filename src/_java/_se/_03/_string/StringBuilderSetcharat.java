package _java._se._03._string;

public class StringBuilderSetcharat {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java tringBuilder");
        sb.setCharAt(4, 'S');
        System.out.println("StringBuilder: " + sb);
    }
}
