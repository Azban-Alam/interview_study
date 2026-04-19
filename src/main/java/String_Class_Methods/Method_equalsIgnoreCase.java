package String_Class_Methods;
public class Method_equalsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
    }
}