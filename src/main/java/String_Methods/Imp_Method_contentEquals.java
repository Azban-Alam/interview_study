package String_Methods;

/*
 * contentEquals(): Checks whether a string contains the exact 
 * same sequence of characters of the specified
 * CharSequence or StringBuffer
 * 
 *  */
public class Imp_Method_contentEquals {
	public static void main(String[] args) {

		// Example 1: Comparing with StringBuffer
		String str = "Hello World";
		StringBuffer sb = new StringBuffer("Hello World");
		System.out.println(str.contentEquals(sb)); // true

		// Example 2: Comparing with CharSequence
		String str1 = "Java";
		CharSequence cs = "Java";
		System.out.println(str1.contentEquals(cs)); // true

	}
}