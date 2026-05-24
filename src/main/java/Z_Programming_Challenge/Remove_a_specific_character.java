package Z_Programming_Challenge;

public class Remove_a_specific_character {

	public static void main(String[] args) {

		String str = "Cloud";
		char target = 'u';
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != target) {
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb.toString());

	}

}
