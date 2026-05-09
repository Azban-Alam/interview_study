package Input_Output_Streams.ByteStream.FileIO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStream_Example1 {
    public static void main(String[] args) {
        // Data to write
        String data = "Hello Buddy, this is FileOutputStream example!";

        // try-with-resources ensures FileOutputStream is closed automatically
        try (FileOutputStream fos = new FileOutputStream("D:\\Eclipse-Workspace\\Interview_Study\\output.txt")) {
            
            // Convert string into bytes
            byte[] bytes = data.getBytes();
            System.out.println(Arrays.toString(bytes));
            
            // Write bytes to the file
            fos.write(bytes);

            System.out.println("Data written successfully to output.txt");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
