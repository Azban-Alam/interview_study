package String_Class_Methods;
public class Method_LastIndexOfExample {
    public static void main(String[] args) {
        String text = "Hello World";

        // Find last occurrence of 'o'
        int pos1 = text.lastIndexOf('o');  
        System.out.println(pos1);  // Output: 7

        // Find last occurrence of "l"
        int pos2 = text.lastIndexOf("l");  
        System.out.println(pos2);  // Output: 9

        // Search 'o' backwards starting from index 5
        int pos3 = text.lastIndexOf('o', 5);  
        System.out.println(pos3);  // Output: 4

        // If not found
        int pos4 = text.lastIndexOf("Java");  
        System.out.println(pos4);  // Output: -1
    }
}
