package Map_SortedMap.Basic_Methods;

import java.util.*;

public class Method_tailMap {
	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);

		System.out.println(map);

		// Purpose: Get all entries from the given key onwards
		System.out.println("TailMap(>=C): " + map.tailMap("C")); // {C=3, D=4}

	}
}
