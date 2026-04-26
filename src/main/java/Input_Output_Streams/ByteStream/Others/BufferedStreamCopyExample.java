package Input_Output_Streams.ByteStream.Others;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopyExample {
    public static void main(String[] args) {
        // Source file and destination file
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        // try-with-resources ensures streams are closed automatically
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            byte[] buffer = new byte[1024]; // 1 KB buffer
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            // Always flush to ensure all data is written
            bos.flush();

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
