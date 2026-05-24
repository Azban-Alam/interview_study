package Z_Programming_Challenge;

public class Count_words_in_a_sentences {

	public static void main(String[] args) {

		String words = "Keep It Simple";
		String[] a = words.split("\\s+");
		int count = a.length;
		System.out.println("Count Of Words " + count);

	}

}
