package _java._se._03._string;

public class StringLiteralPool {
    public static void main(String[] args) {
        // write your code here
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();
        System.out.println("s1==s2?" + (s1==s2));
        System.out.println("s1==s3?" + (s1==s3));
        String hello = "Hello", lo = "lo";
        System.out.print((hello=="Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        System.out.print((_java._se._03._string._other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel" + "lo")) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.println(hello == ("Hel" + lo).intern());

    }
}
