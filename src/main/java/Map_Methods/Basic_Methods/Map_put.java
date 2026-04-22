package Map_Methods.Basic_Methods;

import java.util.*;

public class Map_put {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>(); // Create a HashMap (common Map implementation)

		// 1. put() - Insert key-value pairs
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		System.out.println("Initial Map: " + map);

	}
}


/*
Key		Value
A		100
B		200
C		300

*/