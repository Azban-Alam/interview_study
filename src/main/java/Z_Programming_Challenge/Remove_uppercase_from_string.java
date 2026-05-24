package Z_Programming_Challenge;

public class Remove_uppercase_from_string {

	public static void main(String[] args) {

		String str = "Hello World";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char c : ch) {
			if (Character.isLowerCase(c) || Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
