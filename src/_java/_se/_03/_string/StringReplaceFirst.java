package _java._se._03._string;

public class StringReplaceFirst {
    public static void main(String[] args) {
        String str = "Her name is Tamara. Tamana is a good girl.";
        String strreplace = "Sonia";
        String result = str.replaceFirst("Tamana", strreplace);
        System.out.println(result);
    }
}
