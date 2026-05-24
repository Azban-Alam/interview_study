package Z_Programming_Challenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_charcaters {

	public static void main(String[] args) {

		String str = "programming";
		Set<Character> s1 = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			s1.add(c);
		}

		Character[] a = s1.toArray(new Character[0]);

		for (Character c : a) {
			sb.append(c);
		}

		System.out.println(sb.toString());

	}

}
