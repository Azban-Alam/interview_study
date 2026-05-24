package Z_Programming_Challenge;

public class Common_characters_between_two_strings {

	public static void main(String[] args) {

		String first = "thin";
		String second = "thick";

		for (int i = 0; i < first.length(); i++) {
			char c = first.charAt(i);
			if (second.contains(String.valueOf(c))) {
				System.out.print(c + " ");
			}
		}
	}
}

/*
 * NOTE:
 * String.valueOf(c) → converts the character into a string, because contains()
 * works with strings.
 * 
 */