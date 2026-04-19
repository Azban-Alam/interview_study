package String_Class_Methods;
public class Method_SubstringExample {
    public static void main(String[] args) {
        String text1 = "Hello World";

        // From index 0 to 5
        String sub1 = text1.substring(0, 5);
        System.out.println(sub1);  // Output: Hello

        // From index 6 to end
        String sub2 = text1.substring(6);
        System.out.println(sub2);  // Output: World
        
        String text3 = "Automation Testing";
        String sub3 = text3.substring(11, 18);
        System.out.println(sub3);         // Output: Testing
        
        String text4 = "QA Automation Architect";
        int start = text4.indexOf("Automation");
        int end = text4.indexOf("Architect");

        String sub = text4.substring(start, end).trim();
        System.out.println(sub);        // Output: Automation


    }
}
