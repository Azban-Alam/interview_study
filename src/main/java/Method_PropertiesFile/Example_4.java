package Method_PropertiesFile;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* Java program to demonstrate Properties class to get all the system properties */

/* 
 * Example 2: The below program shows how to use the Properties class to 
 * get all the system properties. Using System.getProperties() method,
 * we can get all the properties of the system.
 * 
 * */

public class Example_4 {
	public static void main(String[] args) throws Exception {
		// get all the system properties
		Properties p = System.getProperties();

		// stores set of properties information
		Set<Map.Entry<Object, Object>> set = p.entrySet();

		for (Map.Entry<Object, Object> entry : set) {

			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		// iterate over the set
		Iterator<Map.Entry<Object, Object>> itr = set.iterator();
		while (itr.hasNext()) {
			// print each property
			Map.Entry<Object, Object> entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}