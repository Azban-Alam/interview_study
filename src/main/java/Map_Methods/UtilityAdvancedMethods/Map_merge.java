package Map_Methods.UtilityAdvancedMethods;

import java.util.*;

public class Map_merge {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 8. merge(K key, V value, BiFunction<V,V,V> function)
		map.merge("B", 200, (oldVal, newVal) -> oldVal + newVal);
		System.out.println("After merge on 'B': " + map);
	}
}
