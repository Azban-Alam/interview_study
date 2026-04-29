package String_Methods;

public class Imp_Method_ToLowerCase {
	public static void main(String[] args) {
		String text = "HELLO WORLD";

		String lower = text.toLowerCase();
		System.out.println(lower);
		// Output: hello world

		String input = "Admin";
		if (input.toLowerCase().equals("admin")) {
			System.out.println("Access granted");
		}

	}
}