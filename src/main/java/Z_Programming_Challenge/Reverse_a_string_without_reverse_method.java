package Z_Programming_Challenge;

public class Reverse_a_string_without_reverse_method {

	public static void main(String[] args) {

		String str = "Selenium";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = ch.length - 1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		
		System.out.println(sb.toString());
	}

}
