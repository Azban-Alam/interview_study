package Z_Programming_Challenge;

import java.util.HashMap;
import java.util.Map;

public class Count_frequency_of_each_character {

	public static void main(String[] args) {

		String str = "aabbc";
		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : ch) {
			// Use getOrDefault directly to handle both first and repeated occurrences
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);

	}

}
