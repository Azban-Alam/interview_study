package String_Class_Methods;

public class Method_ReplaceFirstExample {
	public static void main(String[] args) {
		String text = "Order123 shipped on 2026-04-16";

		// Replace only the first digit with "*"
		String result = text.replaceFirst("\\d", "*");
		System.out.println(result); // Output: Order*23 shipped on 2026-04-16

		// Replace only the first "Java"
		String text1 = "Java is powerful, Java is fun";
		String result1 = text1.replaceFirst("Java", "Python");
		System.out.println(result1); // Output: Python is powerful, Java is fun

		// Replace only the first space with "-"
		String text2 = "Hello World QA";
		String result2 = text2.replaceFirst("\\s", "-");
		System.out.println(result2); // Output: Hello-World QA

		// Replace only the first word ending with 'at'
		String text3 = "Cat bat rat mat";
		String result3 = text3.replaceFirst("\\b\\w+at\\b", "animal");
		System.out.println(result3); // Output: animal bat rat mat

	}
}
