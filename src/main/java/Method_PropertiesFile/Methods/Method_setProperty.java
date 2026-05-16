package Method_PropertiesFile.Methods;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Method_setProperty {
	public static void main(String[] args) throws IOException {

		Properties props = new Properties();

		// 1. setProperty(String key, String value)
		props.setProperty("username", "admin");
		props.setProperty("password", "12345");
		props.setProperty("os", "Windows");

		props.store(new FileWriter("info.properties"), "description");

	}
}
