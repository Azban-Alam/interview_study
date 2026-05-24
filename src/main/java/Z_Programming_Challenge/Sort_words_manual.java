package Z_Programming_Challenge;

public class Sort_words_manual {
	public static void main(String[] args) {

		String str = "Mango Apple Banana";
		String[] words = str.split(" ");

		// Simple bubble sort
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].compareTo(words[j]) > 0) {
					// swap
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}

		// Print sorted words
		for (String w : words) {
			System.out.print(w + " ");
		}
	}
}