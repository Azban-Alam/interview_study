package Method_PropertiesFile.Methods;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Method_store {
	public static void main(String[] args) {

		Properties props = new Properties();

		// 1. setProperty(String key, String value)
		props.setProperty("username", "admin");
		props.setProperty("password", "12345");
		props.setProperty("os", "Windows");

		// 6. store(OutputStream out, String comments)
		try (FileOutputStream fos = new FileOutputStream("config.properties")) {
			props.store(fos, "Stored with OutputStream");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 7. store(Writer writer, String comments)
		try (FileWriter fw = new FileWriter("config_writer.properties")) {
			props.store(fw, "Stored with Writer");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
