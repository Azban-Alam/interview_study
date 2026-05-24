package Z_Programming_Challenge;
public class Remove_special_characters_manual {
    public static void main(String[] args) {
        String str = "Hi! @Home";
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Allow letters, digits, and spaces
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                cleaned.append(c);
            }
        }

        System.out.println("After removing special characters: " + cleaned.toString());
    }
}
