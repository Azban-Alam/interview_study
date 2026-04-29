package String_Methods;

public class Imp_Method_compareTo {
	// compareTo() : Compares two strings lexicographically
	public static void main(String[] args) {

		String s1 = "apple";
		String s2 = "banana";
		String s3 = "apple";

		/*
		 * if the first string is smaller (comes earlier in dictionary order) • Negative
		 * value → Returned
		 */

		System.out.println(s1.compareTo(s2)); // negative (apple < banana)

		/*
		 * if the first string is greater (comes later in dictionary order). • Positive
		 * value → Returned
		 */

		System.out.println(s2.compareTo(s1)); // positive (banana > apple)

		// Returns: • 0 → if both strings are equal.
		System.out.println(s1.compareTo(s3)); // 0 (apple == apple)
	}
}