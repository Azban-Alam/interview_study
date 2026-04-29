package String_Methods;

/*
 * It takes a character array (or a portion of it) and returns a new 
 * string containing those characters.
 * 
 * */

public class Imp_Method_copyValueOf {
	public static void main(String[] args) {

		char[] letters = { 'J', 'a', 'v', 'a' };
		String str = String.copyValueOf(letters);
		System.out.println(str); // Output: Java

		char[] letters1 = { 'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd' };
		String str1 = String.copyValueOf(letters1, 0, 5);
		System.out.println(str1); // Output: Hello

	}
}