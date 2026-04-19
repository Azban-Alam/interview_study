package String_Class_Methods;

public class Method_ReplaceAllExample {
	public static void main(String[] args) {

		// Replace all digits with "*"
		String text = "Order123 shipped on 2026-04-16";
		String result = text.replaceAll("\\d", "*");
		System.out.println(result); // Output: Order*** shipped on ****-**-**

		String text1 = "Java is powerful";
		String result1 = text1.replaceAll("\\s", "");
		System.out.println(result1); // Output: Javaispowerful

		// Replace all words ending with 'at' with 'animal'
		String text2 = "Cat bat rat mat";
		String result2 = text2.replaceAll("\\b\\w+at\\b", "animal");
		System.out.println(result); 	// Output: animal animal animal animal

	}
}
