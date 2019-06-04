package _java._se._03._resourcebundle;

import java.util.ResourceBundle;

public class UseResourceBundle {
    public static void main(String[] args) {
        ResourceBundle bundle;
        String key = "prop.key1";
        bundle = ResourceBundle.getBundle("_java._se._03._resourcebundle.AppResources");
        System.out.println(bundle.getString(key));
    }
}
