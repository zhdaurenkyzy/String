package _java._se._03._resourcebundle;

import java.util.ListResourceBundle;

public class AppResources extends ListResourceBundle {
    public Object[][] getContents() {
        return new Object[][]{
                {"prop.key1", "value1"},
                {"prop.key2", "value2"},
        } ;
    }
}
