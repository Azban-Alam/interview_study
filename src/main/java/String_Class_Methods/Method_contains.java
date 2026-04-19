package String_Class_Methods;

public class Method_contains {
	public static void main(String[] args) {

		// contains() : Checks whether a string contains a sequence of characters
		
		String s = "Hello World";

		System.out.println(s.contains("Hello")); // true
		System.out.println(s.contains("World")); // true
		System.out.println(s.contains("Java")); // false
	}
}