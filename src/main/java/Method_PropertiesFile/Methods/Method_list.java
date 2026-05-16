package Method_PropertiesFile.Methods;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class Method_list {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("db.properties");

		Properties props = new Properties();
		props.load(reader);

		// 4. list(PrintStream out)
		System.out.println("\nListing with PrintStream:");
		props.list(System.out);

		// 5. list(PrintWriter out)
		System.out.println("\nListing with PrintWriter:");
		props.list(new PrintWriter(System.out, true));

	}
}
