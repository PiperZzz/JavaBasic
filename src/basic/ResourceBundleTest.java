package basic;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 *
 * @author PiperZzz
 */
public class ResourceBundleTest {

    public static void test() {

        ResourceBundle rb = ResourceBundle.getBundle("test.bundletest.mybundle");
        Enumeration<String> keys = rb.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = rb.getString(key);
            System.out.println(key + ": " + value);
        }
    }

}

//A ResourceBundle offers a very easy way to access key/value pairs in a properties file in a Java
//The ResourceBundleTest class references the mybundle.properties file via the ResourceBundle.getBundle("test.bundletest.mybundle") method call. 
//Notice that the package of the properties file is specified (using .'s instead of /'s) and that the properties file name is specified without the .properties extension.
//After getting the resource bundle, the ResourceBundleTest class iterates over all of the keys in mybundle.properties and displays each of the keys and its value.
