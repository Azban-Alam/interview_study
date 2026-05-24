package Z_Programming_Challenge;

public class Remove_lowercase_from_string {

	public static void main(String[] args) {

		String str = "Hello World";
		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char e : c) {
			if (Character.isUpperCase(e)||Character.isWhitespace(e)) {
				sb.append(e);
			}
		}
		System.out.println(sb.toString());
	}
}
