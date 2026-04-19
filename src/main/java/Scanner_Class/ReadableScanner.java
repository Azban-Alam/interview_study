package Scanner_Class;
import java.io.StringReader;
import java.util.Scanner;

public class ReadableScanner {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Java Scanner Readable Example");  // Scanner(Readable source)
        Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        sc.close();
    }
}