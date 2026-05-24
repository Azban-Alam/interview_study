package Z_Programming_Challenge;

public class Find_first_repeating_char {
	public static void main(String[] args) {
		String str = "apple";
		char result = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// Check if this character appears again later
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				result = c;
				break; // stop at the first repeating character
			}
		}

		if (result != 0) {
			System.out.println("First repeating character: " + result);
		} else {
			System.out.println("No repeating character found.");
		}
	}
}
