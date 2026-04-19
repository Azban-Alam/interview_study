package String_Class_Methods;

public class Method_StartsWithExample {
	public static void main(String[] args) {
		String text = "Hello World";

		System.out.println(text.startsWith("Hello")); // true
		System.out.println(text.startsWith("World")); // false

		String text2 = "Hello World";

		// Check if substring starting at index 6 begins with "World"
		System.out.println(text2.startsWith("World", 6)); // true

		String text3 = "Java Programming";

		System.out.println(text3.startsWith("Java")); // true
		System.out.println(text3.startsWith("java")); // false (case-sensitive)

		String url = "https://example.com";

		if (url.startsWith("https")) {
			System.out.println("Secure connection");
		} else {
			System.out.println("Not secure");
		}

	}
}
