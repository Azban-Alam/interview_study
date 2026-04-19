package Scanner_Class;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;

public class PathScannerExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("sample.txt");
        Scanner sc = new Scanner(filePath);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}