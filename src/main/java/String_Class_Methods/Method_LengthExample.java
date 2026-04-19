package String_Class_Methods;

public class Method_LengthExample {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "";
		String str3 = "   "; // spaces only

		System.out.println(str1.length()); // Output: 11
		System.out.println(str2.length()); // Output: 0
		System.out.println(str3.length()); // Output: 3 (spaces are counted)
	}
}
