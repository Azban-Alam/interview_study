package Method_PropertiesFile.Methods;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Method_storeToXML {
	public static void main(String[] args) {

		Properties props = new Properties();

		// 1. setProperty(String key, String value)
		props.setProperty("username", "admin");
		props.setProperty("password", "12345");
		props.setProperty("os", "Windows");

		// 8. storeToXML(OutputStream os, String comment)
		try (FileOutputStream fos = new FileOutputStream("config.xml")) {
			props.storeToXML(fos, "Stored to XML");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 9. storeToXML(OutputStream os, String comment, String encoding)
		try (FileOutputStream fos = new FileOutputStream("config_utf8.xml")) {
			props.storeToXML(fos, "Stored to XML with UTF-8", "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 10. storeToXML(OutputStream os, String comment, Charset charset)
		try (FileOutputStream fos = new FileOutputStream("config_charset.xml")) {
			props.storeToXML(fos, "Stored to XML with Charset", StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
