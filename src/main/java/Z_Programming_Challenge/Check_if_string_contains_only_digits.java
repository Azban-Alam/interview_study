package Z_Programming_Challenge;

public class Check_if_string_contains_only_digits {

	public static void main(String[] args) {
		String str = "123a";
		boolean found = false;
		char letter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				found = true;
				letter = str.charAt(i);
				break;
			}
		}

		if (found) {
			System.out.println("Contains Letter :" + letter);
		} else {
			System.out.println("Not Contains Letter :" + letter);
		}
	}

}
