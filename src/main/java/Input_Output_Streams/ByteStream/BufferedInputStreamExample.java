package Input_Output_Streams.ByteStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        // try-with-resources ensures streams are closed automatically
        try (FileInputStream fis = new FileInputStream("test.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {

            int data;
            // Read one byte at a time until EOF (-1)
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
