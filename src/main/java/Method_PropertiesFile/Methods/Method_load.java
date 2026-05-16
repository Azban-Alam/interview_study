package Method_PropertiesFile.Methods;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class Method_load {
	public static void main(String[] args) {

		// 11. load(InputStream inStream)
		try (FileInputStream fis = new FileInputStream("config.properties")) {
			Properties loadedProps = new Properties();
			loadedProps.load(fis);
			System.out.println("\nLoaded from InputStream:");
			loadedProps.list(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 12. load(Reader reader)
		try (FileReader fr = new FileReader("config_writer.properties")) {
			Properties loadedProps = new Properties();
			loadedProps.load(fr);
			System.out.println("\nLoaded from Reader:");
			loadedProps.list(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 13. loadFromXML(InputStream in)
		try (FileInputStream fis = new FileInputStream("config.xml")) {
			Properties loadedProps = new Properties();
			loadedProps.loadFromXML(fis);
			System.out.println("\nLoaded from XML:");
			loadedProps.list(System.out);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
