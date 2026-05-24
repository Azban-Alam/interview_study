package Z_Programming_Challenge;

public class Reverse_a_string {

	public static void main(String[] args) {

		String str = "Java";
		StringBuilder sb = new StringBuilder(str);

		String finalStr = sb.reverse().toString();
		System.out.println("Reversed String :"+finalStr);

	}

}
