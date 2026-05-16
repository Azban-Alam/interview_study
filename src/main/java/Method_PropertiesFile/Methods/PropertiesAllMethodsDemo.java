package Method_PropertiesFile.Methods;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesAllMethodsDemo {
	public static void main(String[] args) {

		Properties props = new Properties();

		// 1. setProperty(String key, String value)
		props.setProperty("username", "admin");
		props.setProperty("password", "12345");
		props.setProperty("os", "Windows");

		// 14. propertyNames()
		System.out.println("\nProperty Names (Enumeration):");
		Enumeration<?> names = props.propertyNames();
		while (names.hasMoreElements()) {
			System.out.println(names.nextElement());

			Object nextElement = names.nextElement();
			System.out.println(nextElement);
		}

		// 15. stringPropertyNames()
		System.out.println("\nString Property Names (Set):");
		Set<String> keys = props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key + " = " + props.getProperty(key));
		}
	}
}
