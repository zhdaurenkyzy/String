package _java._se._03._resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProperty {
    private ResourceBundle bundle;
    public ResourceProperty(Locale locale){
        bundle = ResourceBundle.getBundle("resources.prop", locale);
    }
    public String getValue(String key){
        return bundle.getString(key);
    }
}
