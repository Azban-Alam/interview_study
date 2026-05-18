package Map_SortedMap.Basic_Methods;

import java.util.*;

public class Method_comparator {
	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		System.out.println(map);

		// Purpose: Check comparator used (null = natural ordering)
		System.out.println("Comparator: " + map.comparator()); // null
	}
}
