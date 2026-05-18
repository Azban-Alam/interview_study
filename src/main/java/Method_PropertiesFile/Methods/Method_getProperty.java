package Method_PropertiesFile.Methods;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Method_getProperty {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("db.properties");

		Properties props = new Properties();
		props.load(reader);

		// 2. getProperty(String key)
		System.out.println("Username: " + props.getProperty("username"));

		// 3. getProperty(String key, String defaultValue)
		System.out.println("Role: " + props.getProperty("role", "guest"));
	}
}
