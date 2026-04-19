package String_Class_Methods;

public class Method_endsWith {
	public static void main(String[] args) {
		String str = "HelloWorld";
		System.out.println(str.endsWith("World")); // true
		System.out.println(str.endsWith("Hello")); // false
		System.out.println(str.endsWith("ld")); // true
	}
}