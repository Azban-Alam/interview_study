package Map_Methods.Basic_Methods;

import java.util.*;

public class Map_remove {
	public static void main(String[] args) {
		// Create a HashMap (common Map implementation)
		Map<String, Integer> map = new HashMap<>();

		// 1. put(K key, V value) - Insert or update
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		System.out.println("Initial Map: " + map);

		// 3. remove(Object key) - Remove entry
		Integer removedValue = map.remove("C");
		System.out.println("Removed value for key 'C': " + removedValue);
		System.out.println("Map after remove: " + map);

	}
}
