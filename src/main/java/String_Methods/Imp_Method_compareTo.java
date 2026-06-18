package String_Methods;

//compareTo() : Compares two strings lexicographically

public class Imp_Method_compareTo {
	public static void main(String[] args) {

		String s1 = "apple";
		String s2 = "banana";
		String s3 = "apple";

		// If Negative value → Returned (first string is smaller than second string)
		System.out.println(s1.compareTo(s2)); // negative (apple < banana)

		// If Positive value → Returned (first string is greater than first string)
		System.out.println(s2.compareTo(s1)); // positive (banana > apple)

		// Returns: 0 → if both strings are equal.
		System.out.println(s1.compareTo(s3)); // 0 (apple == apple)
	}
}