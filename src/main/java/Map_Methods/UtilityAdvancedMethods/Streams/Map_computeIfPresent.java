package Map_Methods.UtilityAdvancedMethods.Streams;

import java.util.*;

public class Map_computeIfPresent {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 7. computeIfPresent(K key, BiFunction<K,V,V> function)
		map.computeIfPresent("C", (k, v) -> v + 50);
		System.out.println("After computeIfPresent 'C': " + map);

	}
}
