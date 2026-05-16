package Input_Output_Streams.CharcaterStream.File_Writer_Class;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) {
        File file = new File("example2.txt");

        try (FileWriter fw = new FileWriter(file, true)) { // append mode
            fw.write("Appending new line...\n");
            System.out.println("Data appended using FileWriter(File file, boolean append).");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
