package Z_Programming_Challenge;

public class Reverse_each_word_in_a_sentence {

	public static void main(String[] args) {

		String str = "Hello World";
		String[] sa = str.split("\\s");
		String fWord = "";

		for (int i = 0; i < sa.length; i++) {
			String st = sa[i];
			String word = "";

			for (int j = st.length() - 1; j >= 0; j--) {

				word = word + st.charAt(j);

			}

			fWord = fWord + word + " ";
		}

		System.out.println(fWord);
	}

}
