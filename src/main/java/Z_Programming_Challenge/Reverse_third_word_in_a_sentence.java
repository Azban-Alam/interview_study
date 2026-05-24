package Z_Programming_Challenge;

public class Reverse_third_word_in_a_sentence {

	public static void main(String[] args) {

		String str = "I Love Java Coding";
		String[] word = str.split("\\s");

		String thirdWord = word[2];
		System.out.println(thirdWord);
		
		StringBuilder sb = new StringBuilder();

		for (int i = thirdWord.length() - 1; i >= 0; i--) {
			String string = word[i];

		}

	}

}
