package Map_SortedMap.Basic_Methods;

import java.util.*;

public class Method_headMap {
	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		System.out.println(map);

		// Purpose: Get all entries before the given key
		System.out.println("HeadMap(<C): " + map.headMap("C")); // {A=1, B=2}

	}
}
