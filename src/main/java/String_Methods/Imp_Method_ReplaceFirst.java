package String_Methods;

public class Imp_Method_ReplaceFirst {
	public static void main(String[] args) {

		String text = "Order123 shipped on 2026-04-16";

		String result = text.replaceFirst("\\d", "*");// Replace only the first digit with "*"
		System.out.println(result); // Output: Order*23 shipped on 2026-04-16

		String text1 = "Java is powerful, Java is fun";
		String result1 = text1.replaceFirst("Java", "Python");// Replace only the first "Java"
		System.out.println(result1); // Output: Python is powerful, Java is fun

		String text2 = "Hello World QA";
		String result2 = text2.replaceFirst("\\s", "-");// Replace only the first space with "-"
		System.out.println(result2); // Output: Hello-World QA

		String text3 = "Cat bat rat mat";
		String result3 = text3.replaceFirst("\\b\\w+at\\b", "animal");// Replace only the first word ending with 'at'
		System.out.println(result3); // Output: animal bat rat mat

	}
}
