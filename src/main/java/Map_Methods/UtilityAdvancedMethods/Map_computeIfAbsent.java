package Map_Methods.UtilityAdvancedMethods;

import java.util.*;

public class Map_computeIfAbsent {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 6. computeIfAbsent(K key, Function<K,V> function)
		map.computeIfAbsent("D", k -> 500);
		System.out.println("After computeIfAbsent 'D': " + map);

	}
}
