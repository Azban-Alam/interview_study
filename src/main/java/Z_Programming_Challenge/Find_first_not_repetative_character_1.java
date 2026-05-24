package Z_Programming_Challenge;

public class Find_first_not_repetative_character_1 {
	public static void main(String[] args) {
		String str = "stress";
		boolean found = false;

		// Check each character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int count = 0;

			// Count how many times this char appears
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == c) {
					count++;
				}
			}

			// If count is 1, this is first non-repeating
			if (count == 1) {
				System.out.println(c); // t
				found = true;
				break; // stop after first one
			}
		}

		if (!found) {
			System.out.println("No non-repeating character");
		}
	}
}