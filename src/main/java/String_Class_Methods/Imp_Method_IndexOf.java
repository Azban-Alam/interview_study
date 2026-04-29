package String_Class_Methods;

public class Imp_Method_IndexOf {
	public static void main(String[] args) {

		String text = "Hello World";

		int pos1 = text.indexOf('o'); // Find first occurrence of 'o'
		System.out.println(pos1); // Output: 4

		int pos2 = text.indexOf("World"); // Find first occurrence of "World"
		System.out.println(pos2); // Output: 6

		int pos3 = text.indexOf('o', 5); // Search 'o' starting from index 5
		System.out.println(pos3); // Output: 7

		int pos4 = text.indexOf("Java"); // If not found
		System.out.println(pos4); // Output: -1

	}
}
