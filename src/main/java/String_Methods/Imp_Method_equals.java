package String_Methods;

public class Imp_Method_equals {
	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		String s3 = "JAVA";

		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false (case-sensitive)

	}
}