package Z_Programming_Challenge;

public class Reverse_third_word_in_a_sentence {

	public static void main(String[] args) {

		String str = "I Love Java Coding";
		String[] word = str.split("\\s");

		// Get the 3rd word (index 2)
		String thirdWord = word[2];

		// Reverse the 3rd word
		StringBuilder sb = new StringBuilder();
		for (int i = thirdWord.length() - 1; i >= 0; i--) {
			sb.append(thirdWord.charAt(i));
		}

		// Replace the 3rd word with its reversed version
		word[2] = sb.toString();

		// Build the new sentence
		String newSentence = String.join(" ", word);

		// Print result
		System.out.println(newSentence);
	}
}
