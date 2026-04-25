package Generics.Generic_Methods;

class GM {

	// A Generic method example
	public static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}
}

class Geeks {

	public static void main(String[] args) {
		// Calling generic method with Integer argument
		GM.genericDisplay(11);

		// Calling generic method with String argument
		GM.genericDisplay("GeeksForGeeks");

		// Calling generic method with double argument
		GM.genericDisplay(1.0);
	}
}