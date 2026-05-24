package Z_Programming_Challenge;

import java.util.Arrays;

public class Sort_characters_in_a_string {
	public static void main(String[] args) {

		String str = "rock";
		char[] chars = str.toCharArray(); // Convert string to char array

		Arrays.sort(chars); // Sort the array

		String sorted = new String(chars); // Convert back to string

		System.out.println("Original: " + str);
		System.out.println("Sorted: " + sorted);
	}
}
