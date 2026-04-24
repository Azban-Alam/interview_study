package Method_PropertiesFile;
// Java program to demonstrate Properties class to get all
// the system properties

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*Example 2: The below program shows how to use the Properties class to get all the system properties. 
 * Using System.getProperties() method, we can get all the properties of the system.*/

public class Example_4 {
	public static void main(String[] args) throws Exception {
		// get all the system properties
		Properties p = System.getProperties();

		// stores set of properties information
		Set set = p.entrySet();

		// iterate over the set
		Iterator itr = set.iterator();
		while (itr.hasNext()) {

			// print each property
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}