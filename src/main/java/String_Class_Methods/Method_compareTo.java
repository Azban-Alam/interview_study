package String_Class_Methods;

public class Method_compareTo {
	public static void main(String[] args) {
		// compareTo() : Compares two strings lexicographically

		String s1 = "apple";
		String s2 = "banana";
		String s3 = "apple";

		// • Negative value → if the first string is smaller (comes earlier in dictionary order).
		System.out.println(s1.compareTo(s2)); // negative (apple < banana)
		
		// • Positive value → if the first string is greater (comes later in dictionary order).
		System.out.println(s2.compareTo(s1)); // positive (banana > apple)
		
		// Returns: • 0 → if both strings are equal.
		System.out.println(s1.compareTo(s3)); // 0 (apple == apple)
	}
}