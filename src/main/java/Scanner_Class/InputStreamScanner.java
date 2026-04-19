package Scanner_Class;
import java.util.Scanner;

public class InputStreamScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner(InputStream source)

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your name: ");
        sc.nextLine(); // consume leftover newline
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close();
    }
}