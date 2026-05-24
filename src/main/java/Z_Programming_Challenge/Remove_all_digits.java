package Z_Programming_Challenge;

public class Remove_all_digits {

	public static void main(String[] args) {

		String str = "Java123";
		String fs = str.replaceAll("\\d+", "");
		System.out.println(fs);
	}

}
