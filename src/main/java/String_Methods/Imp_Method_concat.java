package String_Methods;

public class Imp_Method_concat {
	public static void main(String[] args) {

		// concat() : Appends a string to the end of another string
		
		String s1 = "Hello";
		String s2 = "World";

		String result = s1.concat(" ").concat(s2);
		System.out.println(result); // Hello World

		// Original strings remain unchanged
		System.out.println(s1); // Hello
		System.out.println(s2); // World
	}
}