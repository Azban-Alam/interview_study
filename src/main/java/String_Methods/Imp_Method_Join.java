package String_Methods;

import java.util.Arrays;
import java.util.List;

public class Imp_Method_Join {
	public static void main(String[] args) {

		String result0 = String.join(", ", "Apple", "Banana", "Cherry");
		System.out.println(result0); // Output: Apple, Banana, Cherry

		String result1 = String.join("-", "2026", "04", "16");
		System.out.println(result1); // Output: 2026-04-16

		List<String> names = Arrays.asList("Israr", "Alam", "QA Architect");
		String joined = String.join(" | ", names);
		System.out.println(joined); // Output: Israr | Alam | QA Architect

	}
}
