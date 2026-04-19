package String_Class_Methods;

public class Method_IndexOfExample {
	public static void main(String[] args) {
		String text = "Hello World";

		// Find first occurrence of 'o'
		int pos1 = text.indexOf('o');
		System.out.println(pos1); // Output: 4

		// Find first occurrence of "World"
		int pos2 = text.indexOf("World");
		System.out.println(pos2); // Output: 6

		// Search 'o' starting from index 5
		int pos3 = text.indexOf('o', 5);
		System.out.println(pos3); // Output: 7

		// If not found
		int pos4 = text.indexOf("Java");
		System.out.println(pos4); // Output: -1
	}
}
