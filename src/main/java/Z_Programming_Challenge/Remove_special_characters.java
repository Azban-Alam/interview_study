package Z_Programming_Challenge;

public class Remove_special_characters {
	public static void main(String[] args) {
		String str = "Hi! @Home";

		// Replace everything except letters and digits
		String cleaned = str.replaceAll("[^a-zA-Z0-9 ]", "");

		System.out.println("After removing special characters: " + cleaned);
	}
}
