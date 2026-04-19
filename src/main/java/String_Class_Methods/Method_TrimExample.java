package String_Class_Methods;

public class Method_TrimExample {
	public static void main(String[] args) {
		String text = "   Hello World   ";

		String result = text.trim();
		System.out.println("Before: [" + text + "]");
		System.out.println("After: [" + result + "]");
		// Output:
		// Before: [ Hello World ]
		// After: [Hello World]

		String text1 = "\u2005Hello\u2005"; // contains Unicode whitespace

		System.out.println(text1.trim()); // Does NOT remove Unicode whitespace
		System.out.println(text1.strip()); // Removes Unicode whitespace

	}
}
