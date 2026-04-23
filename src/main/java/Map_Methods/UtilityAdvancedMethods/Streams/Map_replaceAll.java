package Map_Methods.UtilityAdvancedMethods.Streams;

import java.util.*;

public class Map_replaceAll {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 4. replaceAll(BiFunction<K,V,V> function) - Replace all values
		map.replaceAll((k, v) -> v + 10);
		System.out.println("After replaceAll (+10): " + map);

	}
}