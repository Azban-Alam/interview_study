package String_Class_Methods;

public class Method_ValueOfExample {
	public static void main(String[] args) {
		int num = 100;
		double d = 45.67;

		String str1 = String.valueOf(num);
		String str2 = String.valueOf(d);

		System.out.println(str1); // Output: "100"
		System.out.println(str2); // Output: "45.67"

		boolean flag = true;
		String str = String.valueOf(flag);
		System.out.println(str); // Output: "true"

		char[] letters = { 'J', 'a', 'v', 'a' };
		String str3 = String.valueOf(letters);
		System.out.println(str3); // Output: "Java"

		// Autoboxing (preferred)
		Integer obj1 = 500;

		// Using valueOf() (explicit but efficient)
		Integer obj2 = Integer.valueOf(500);

		// Both are safe and recommended
		System.out.println(obj1.toString()); // "500"
		System.out.println(obj2.toString()); // "500"

		Integer num1 = null;

		// String.valueOf() handles null safely
		String str11 = String.valueOf(num1);
		System.out.println(str11); // Output: "null" // num.toString() would throw NullPointerException

	}
}
