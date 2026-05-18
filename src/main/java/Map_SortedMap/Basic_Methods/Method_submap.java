package Map_SortedMap.Basic_Methods;

import java.util.*;

public class Method_submap {
	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		System.out.println(map);

		// Purpose: Get entries between two keys (from inclusive, to exclusive)
		System.out.println("SubMap(B to D): " + map.subMap("B", "D")); // {B=2, C=3}

	}
}
