package String_Class_Methods;

//contains() : Checks whether a string contains a sequence of characters

public class Imp_Method_contains {
	public static void main(String[] args) {

		String s = "Hello World";

		System.out.println(s.contains("Hello")); // true
		System.out.println(s.contains("World")); // true
		System.out.println(s.contains("Java")); // false
	}
}