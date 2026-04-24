package Method_PropertiesFile;
// Java program to demonstrate Properties class to create

// the properties file
/*
 * Example 3: The below program shows how to use the Properties class to create a properties file.
 */

import java.util.*;
import java.io.*;

public class Example_3 {
	public static void main(String[] args) throws Exception {
		// create an instance of Properties
		Properties p = new Properties();

		// add properties to it
		p.setProperty("name", "Ganesh Chowdhary Sadanala");
		p.setProperty("email", "ganeshs.gfg@gmail.com");

		// store the properties to a file
		p.store(new FileWriter("info.properties"), "GeeksforGeeks Properties Example");
	}
}