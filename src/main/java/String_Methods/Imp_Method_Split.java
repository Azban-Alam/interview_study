package String_Class_Methods;

public class Imp_Method_Split {
	public static void main(String[] args) {

		String text = "Java is powerful";
		String[] words = text.split(" ");
		for (String word : words) {
			System.out.println(word);
		} // [Output: Java is powerful]

		String text1 = "Apple,Banana,Cherry";
		String[] fruits = text1.split(",");
		for (String fruit : fruits) {
			System.out.println(fruit);
		} // [Output: Apple Banana Cherry]

		String text2 = "abc123xyz456pqr";
		String[] parts = text2.split("\\d+"); // split by one or more digits
		for (String part : parts) {
			System.out.println(part);
		} // [Output: abc xyz pqr]

		String fileName = "document.pdf";
		String[] parts4 = fileName.split("\\.");
		System.out.println("Name: " + parts4[0]); // document
		System.out.println("Extension: " + parts4[1]); // pdf

		String text5 = "Apple,Banana;Cherry,Orange";
		String[] fruits5 = text5.split("[,;]");
		for (String fruit : fruits5) {
			System.out.println(fruit);
		} // [Output:Apple Banana Cherry Orange]

		String text6 = "JavaIsPowerfulLanguage";
		String[] words6 = text6.split("(?=[A-Z])");
		for (String word : words6) {
			System.out.println(word);
		} // [Output:Java Is Powerful Language]

		String text7 = "Line1\nLine2\nLine3";
		String[] lines7 = text7.split("\\n");
		for (String line : lines7) {
			System.out.println(line);
		} // [Output:Line1 Line2 Line3]

		String text8 = "Java    is   powerful";
		String[] words8 = text8.split("\\s+");
		for (String word : words8) {
			System.out.println(word);
		} // [Output: Java is powerful]

		String text9 = "one:two:three:four";
		String[] parts9 = text9.split(":", 2);
		for (String part : parts9) {
			System.out.println(part);
		} // [Output: one two:three:four]

		// Split into max 3 parts
		String text3 = "one:two:three:four";
		String[] parts3 = text3.split(":", 3);
		for (String part : parts3) {
			System.out.println(part);
		} // [Output:one two three:four]

	}
}
