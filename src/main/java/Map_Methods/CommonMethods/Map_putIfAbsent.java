package Map_Methods.CommonMethods;

import java.util.HashMap;
import java.util.Map;

public class Map_putIfAbsent {

	public static void main(String[] args) {

		// Creating a HashMap
		Map<Integer, String> map = new HashMap<>();

		// put(): Insert elements
		map.put(101, "QA");
		map.put(102, "Dev");
		map.put(103, "Ops");
		map.put(104, "PM");

		// putIfAbsent(): Insert only if key is not present
		map.putIfAbsent(105, "HR");

	}
}