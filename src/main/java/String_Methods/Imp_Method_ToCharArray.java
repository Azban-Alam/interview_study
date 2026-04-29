package String_Class_Methods;

public class Imp_Method_ToCharArray {
	public static void main(String[] args) {
		String text = "Hello";
		char[] chars = text.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		} // [Output: H e l l o ]

		String text1 = "World";
		char[] chars1 = text1.toCharArray();
		System.out.println(chars1[0]); // W
		System.out.println(chars1[4]); // d

		String text2 = "Java";
		char[] chars2 = text2.toCharArray();
		for (int i = chars2.length - 1; i >= 0; i--) {
			System.out.print(chars2[i]);
		} // Output: avaJ

		String text4 = "Automation Testing";
		char[] chars4 = text4.toCharArray();
		int count = 0;
		for (char c : chars4) {
			if ("AEIOUaeiou".indexOf(c) != -1) {
				count++;
			}
		}
		System.out.println("Number of vowels: " + count);
		// Output: Number of vowels: 7

	}
}
