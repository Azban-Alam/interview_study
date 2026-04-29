package String_Methods;

public class Imp_Method_HashCode {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "Java";

		System.out.println(s1.hashCode()); // 2301506
		System.out.println(s2.hashCode()); // 78261102
		System.out.println(s3.hashCode()); // 2301506 (same as s1)
	}
}

/* 👉 In Java, hashCode() does not return the memory address of a string (or any object). 
 * Instead, it returns a calculated integer value based on the string’s characters, 
 * using the formula I showed earlier with powers of 31.*/
