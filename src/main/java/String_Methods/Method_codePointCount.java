package String_Methods;

public class Method_codePointCount {

	public static void main(String[] args) {
		
		// codePointCount()		Returns the number of Unicode values found in a string	
		
		String s1 = "Hello";
		
		int c1 = s1.codePointCount(0, 4);
		System.out.println(c1);
	}

}
