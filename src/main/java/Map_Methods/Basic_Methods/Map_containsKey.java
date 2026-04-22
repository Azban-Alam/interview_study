package Map_Methods.Basic_Methods;

import java.util.*;

public class Map_containsKey {
	public static void main(String[] args) {
		// Create a HashMap (common Map implementation)
		Map<String, Integer> map = new HashMap<>();

		// 1. put() - Insert key-value pairs
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		System.out.println("Initial Map: " + map);

		// 3. containsKey() and containsValue()
		System.out.println("Contains key 'A'? " + map.containsKey("A"));
		System.out.println("Contains value 500? " + map.containsValue(500));

	}
}
