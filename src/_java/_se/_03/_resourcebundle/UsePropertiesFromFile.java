package _java._se._03._resourcebundle;
import java.util.Locale;

public class UsePropertiesFromFile {
    public static void main(String[] args) {
        ResourceProperty myBundle = new ResourceProperty(new Locale("en", "US"));
        System.out.println(myBundle.getValue("prop.key1"));

        myBundle = new ResourceProperty(new Locale("en", "UK"));
        System.out.println(myBundle.getValue("prop.key2"));

        myBundle = new ResourceProperty(new Locale("ru", "BY"));
        System.out.println(myBundle.getValue("prop.key1"));
        myBundle = new ResourceProperty(new Locale("ru", "RU"));
        System.out.println(myBundle.getValue("prop.key2"));

    }
}
