package String_Methods;

public class Imp_Method_IsEmpty {
	public static void main(String[] args) {

		String str1 = "";
		String str2 = "Hello";
		String str3 = "   "; // spaces only

		System.out.println(str1.isEmpty()); // true (no characters)
		System.out.println(str2.isEmpty()); // false (contains "Hello")
		System.out.println(str3.isEmpty()); // false (spaces count as characters)

		String str4 = null; // Null case
		System.out.println(str4.isEmpty()); // This will throw NullPointerException
	}
}
