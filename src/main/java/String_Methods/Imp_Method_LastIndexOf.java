package String_Methods;

public class Imp_Method_LastIndexOf {
	public static void main(String[] args) {

		String text = "Hello World";

		int pos1 = text.lastIndexOf('o'); // Find last occurrence of 'o'
		System.out.println(pos1); // Output: 7

		int pos2 = text.lastIndexOf("l"); // Find last occurrence of "l"
		System.out.println(pos2); // Output: 9

		int pos3 = text.lastIndexOf('o', 5); // Search 'o' backwards starting from index 5
		System.out.println(pos3); // Output: 4

		int pos4 = text.lastIndexOf("Java"); // If not found
		System.out.println(pos4); // Output: -1
	}
}
