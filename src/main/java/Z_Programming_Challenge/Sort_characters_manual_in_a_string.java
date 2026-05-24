package Z_Programming_Challenge;

public class Sort_characters_manual_in_a_string {
	public static void main(String[] args) {
		String str = "rock";
		char[] chars = str.toCharArray();

		// Bubble sort logic
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					// swap
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}

		String sorted = new String(chars);
		System.out.println("Original: " + str);
		System.out.println("Sorted: " + sorted);
	}
}