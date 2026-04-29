package String_Methods;

public class Imp_Method_Replace {
	public static void main(String[] args) {

		String text = "Hello World";

		String result1 = text.replace('o', 'x'); // Replace 'o' with 'x'
		System.out.println(result1); // Output: Hellx Wxrld

		String text1 = "Java is fun, Java is powerful";// Replace "Java" with "Python"
		String result2 = text1.replace("Java", "Python");
		System.out.println(result2); // Output: Python is fun, Python is powerful

		String text2 = "Hello hello";
		String result3 = text2.replace("Hello", "Hi");// Replace "Hello" only
		System.out.println(result3); // Output: Hi hello (notice lowercase "hello" is not replaced)

	}
}
