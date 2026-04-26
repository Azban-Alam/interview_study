package Input_Output_Streams.ByteStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello Buddy, writing with BufferedOutputStream!";

        // try-with-resources ensures streams are closed automatically
        try (FileOutputStream fos = new FileOutputStream("output.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            // Convert string into bytes
            byte[] bytes = data.getBytes();

            // Write bytes to the buffer
            bos.write(bytes);

            // Always flush to ensure data is written to file
            bos.flush();

            System.out.println("Data written successfully to output.txt");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
