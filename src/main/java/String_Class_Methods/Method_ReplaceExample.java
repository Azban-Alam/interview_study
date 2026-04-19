package String_Class_Methods;

public class Method_ReplaceExample {
	public static void main(String[] args) {
		String text = "Hello World";

		// Replace 'o' with 'x'
		String result1 = text.replace('o', 'x');
		System.out.println(result1); // Output: Hellx Wxrld

		// Replace "Java" with "Python"
		String text1 = "Java is fun, Java is powerful";
		String result2 = text1.replace("Java", "Python");
		System.out.println(result2); // Output: Python is fun, Python is powerful

		// Replace "Hello" only
		String text2 = "Hello hello";
		String result3 = text2.replace("Hello", "Hi");
		System.out.println(result3); 	// Output: Hi hello (notice lowercase "hello" is not replaced)

	}
}
