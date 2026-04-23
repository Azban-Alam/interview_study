package Map_Methods.UtilityAdvancedMethods.Streams;

import java.util.*;

public class Map_compute {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 5. compute(K key, BiFunction<K,V,V> function) - Compute new value
		map.compute("B", (k, v) -> v * 2);
		System.out.println("After compute on 'B': " + map);

		// 6. computeIfAbsent(K key, Function<K,V> function)
		map.computeIfAbsent("D", k -> 500);
		System.out.println("After computeIfAbsent 'D': " + map);

		// 7. computeIfPresent(K key, BiFunction<K,V,V> function)
		map.computeIfPresent("C", (k, v) -> v + 50);
		System.out.println("After computeIfPresent 'C': " + map);

		// 8. merge(K key, V value, BiFunction<V,V,V> function)
		map.merge("B", 200, (oldVal, newVal) -> oldVal + newVal);
		System.out.println("After merge on 'B': " + map);
	}
}
