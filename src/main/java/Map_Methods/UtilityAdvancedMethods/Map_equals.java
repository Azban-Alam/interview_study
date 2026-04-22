package Map_Methods.UtilityAdvancedMethods;

import java.util.*;

public class Map_equals {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 1. equals(Object o) - Compare maps
		Map<String, Integer> anotherMap = new HashMap<>();
		anotherMap.put("A", 100);
		anotherMap.put("B", 200);
		anotherMap.put("C", 300);
		System.out.println("Maps equal? " + map.equals(anotherMap));

	}
}
