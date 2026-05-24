package Z_Programming_Challenge;

import java.util.HashSet;

public class Longest_substring_norepeat {
	public static void main(String[] args) {
		String str = "abcabcbb";
		String longest = "";

		for (int i = 0; i < str.length(); i++) {
			HashSet<Character> set = new HashSet<>();
			StringBuilder current = new StringBuilder();

			for (int j = i; j < str.length(); j++) {
				char c = str.charAt(j);

				// If character already exists, break
				if (set.contains(c)) {
					break;
				}

				set.add(c);
				current.append(c);
			}

			// Update longest if current is bigger
			if (current.length() > longest.length()) {
				longest = current.toString();
			}
		}

		System.out.println("Longest substring without repeats: " + longest);
		System.out.println("Length: " + longest.length());
	}
}