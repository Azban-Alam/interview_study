package Z_Programming_Challenge;

public class Find_first_not_repetative_character {
	public static void main(String[] args) {

		String str = "strtess";
		char result = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				result = c;
				break;
			}
		}
		
		System.out.println("First Non-Repetive Character : "+result);

	}
}
