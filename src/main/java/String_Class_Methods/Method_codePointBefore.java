package String_Class_Methods;

public class Method_codePointBefore {

	public static void main(String[] args) {
		
		// codePointBefore() : Returns the Unicode of the character before the specified index		
		
		String s1 = "Hello";
		
		int c1 = s1.codePointBefore(2);
		System.out.println(c1);
	}

}
