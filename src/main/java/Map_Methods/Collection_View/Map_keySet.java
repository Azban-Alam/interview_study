package Map_Methods.Collection_View;

import java.util.*;

public class Map_keySet {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();

		// Add some entries
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 1. keySet() - Returns all keys
		Set<String> keys = map.keySet();
		System.out.println("Keys: " + keys);

		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
			String s1 = (String) iterator.next();
			System.out.println(s1);
		}

		// 2. values() - Returns all values
		Collection<Integer> values = map.values();
		System.out.println("Values: " + values);

		for (Iterator<Integer> iterator = values.iterator(); iterator.hasNext();) {
			Integer i1 = (Integer) iterator.next();
			System.out.println(i1);
		}

		// 3. entrySet() - Returns all key-value pairs
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		System.out.println("Entries: " + entries);

		// Iterating over entrySet
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
			entry.setValue(610);
		}
		System.out.println(map);
	}
}
