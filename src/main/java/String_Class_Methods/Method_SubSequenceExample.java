package String_Class_Methods;

public class Method_SubSequenceExample {
	public static void main(String[] args) {
		String text = "Hello World";
		CharSequence seq = text.subSequence(0, 5);
		System.out.println(seq); // Output: Hello

		String text1 = "Automation Testing";
		CharSequence seq1 = text1.subSequence(11, 18);
		System.out.println(seq1); // Output: Testing

		String text2 = "Java Programming";

		// Using substring()
		String sub2 = text2.substring(5, 16);
		System.out.println(sub2);
		// Output: Programming

		// Using subSequence()
		CharSequence seq3 = text2.subSequence(5, 16);
		System.out.println(seq3);
		// Output: Programming (but type is CharSequence)

	}
}
