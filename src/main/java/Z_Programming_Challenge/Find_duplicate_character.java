package Z_Programming_Challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Find_duplicate_character {

	public static void main(String[] args) {

		String str = "test";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entry = map.entrySet();
		for (Map.Entry<Character, Integer> e : entry) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + "-----" + e.getValue());
			}
		}
	}

}
