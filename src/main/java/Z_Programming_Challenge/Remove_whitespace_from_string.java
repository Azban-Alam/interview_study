package Z_Programming_Challenge;

public class Remove_whitespace_from_string {

	public static void main(String[] args) {
		
		String str = "J a v a";
		String word = str.replaceAll("\\s+","");
		System.out.println(word);
	}

}
