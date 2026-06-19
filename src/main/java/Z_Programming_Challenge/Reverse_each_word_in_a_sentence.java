package Z_Programming_Challenge;

public class Reverse_each_word_in_a_sentence {

	public static void main(String[] args) {

		String str = "Hello World";
		String[] sa = str.split("\\s");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sa.length; i++) {
			String st = sa[i];
			for (int j = st.length() - 1; j >= 0; j--) {
				sb.append(st.charAt(j));
			}
			sb.append(" ");
		}

		System.out.println(sb);
	}

}