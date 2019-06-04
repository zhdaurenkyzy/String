package _java._se._03._locale;
import java.sql.SQLOutput;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        Locale rusLocale = new Locale("ru", "RU");
        Locale usLocale = new Locale("en", "US");
        Locale frLocale = new Locale("fr", "FR");
        System.out.println(defaultLocale.getDisplayCountry());
        System.out.println(defaultLocale.getDisplayCountry(Locale.FRENCH));
        System.out.println(frLocale.getDisplayCountry(defaultLocale));

        System.out.println(usLocale.getDisplayName());
        System.out.println(usLocale.getDisplayName(frLocale));

        System.out.println(rusLocale.getDisplayName(frLocale));

        System.out.println(defaultLocale.getCountry());
        System.out.println(defaultLocale.getLanguage());
        System.out.println(defaultLocale.getVariant());


    }
}
