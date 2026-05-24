package Z_Programming_Challenge;

public class Count_Vowels_and_consonants {

	public static void main(String[] args) {

		String str = "Automation";
		String vowels = "AEIOUaeiou";
		int cCount = 0;
		int vCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				vCount++;
			} else {
				cCount++;
			}
		}

		System.out.println("Vowels Count " + vCount);
		System.out.println("Consonant Count " + cCount);
	}

}
