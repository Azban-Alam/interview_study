package Stack_Methods;
import java.util.Stack;

public class Stack_Method {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // push()
        stack.push("Java");
        stack.push("Selenium");
        stack.push("SQL");
        System.out.println("Stack after pushes: " + stack);

        // peek()
        System.out.println("Top element (peek): " + stack.peek());

        // pop()
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // search()
        int pos = stack.search("Java");
        System.out.println("Position of 'Java' from top: " + pos);

        // empty()
        System.out.println("Is stack empty? " + stack.empty());
    }
}
