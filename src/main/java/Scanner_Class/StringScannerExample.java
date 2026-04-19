package Scanner_Class;
import java.util.Scanner;

public class StringScannerExample {
    public static void main(String[] args) {
        String data = "Java 17 is stable";
        Scanner sc = new Scanner(data);   // Scanner(String source)

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        sc.close();
    }
}