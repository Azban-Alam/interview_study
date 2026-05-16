package Input_Output_Streams.CharcaterStream.File_Writer_Class;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
    public static void main(String[] args) {
        File file = new File("example1.txt");

        try (FileWriter fw = new FileWriter(file)) {
            fw.write("This will overwrite existing content.");
            System.out.println("Data written using FileWriter(File file).");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
