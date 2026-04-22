package Map_Methods.UtilityAdvancedMethods;

import java.util.*;

public class Map_hashCode {
	public static void main(String[] args) {
		// Create a HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);

		// 2. hashCode() - Get hash code
		System.out.println("HashCode of map: " + map.hashCode());

	}
}
