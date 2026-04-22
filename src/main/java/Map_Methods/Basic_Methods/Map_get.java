package Map_Methods.Basic_Methods;

import java.util.*;

public class Map_get {
	public static void main(String[] args) {
		// Create a HashMap (common Map implementation)
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		System.out.println("Initial Map: " + map);  // 1. put() - Insert key-value pairs

		// 2. get() - Retrieve value by key
		System.out.println("Value for key 'B': " + map.get("B"));

	}
}
