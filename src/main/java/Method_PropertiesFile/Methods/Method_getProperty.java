package Method_PropertiesFile.Methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

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
