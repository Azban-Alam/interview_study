package Map_Methods.CommonMethods;

import java.util.HashMap;
import java.util.Map;

public class Map_conditional_replace {

	public static void main(String[] args) {

		// Creating a HashMap
		Map<Integer, String> map = new HashMap<>();

		// put(): Insert elements
		map.put(101, "QA");
		map.put(102, "Dev");
		map.put(103, "Ops");
		map.put(104, "PM");

		// replace(key, oldValue, newValue): Conditional replace
		map.replace(103, "Ops", "TechOps");

		// Final map state
		System.out.println("Final map: " + map);
	}
}