package Map_Methods.UtilityAdvancedMethods;

import java.util.*;

public class Map_replace {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 3. replace(K key, V value) - Replace value if key exists
		map.replace("A", 111);
		System.out.println("After replace: " + map);

	}
}
