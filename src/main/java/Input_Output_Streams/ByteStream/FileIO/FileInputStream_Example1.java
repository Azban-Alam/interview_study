package Input_Output_Streams.ByteStream.FileIO;

import java.io.File;

/*Read a Text File (Basic Example)
This example uses FileInputStream to read a text file, one byte at a time, and print the result as characters:*/

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_Example1 {
    public static void main(String[] args) {

        // try-with-resources ensures FileInputStream is closed automatically
        try (FileInputStream input = new FileInputStream(
                new File("D:\\Eclipse-Workspace\\Interview_Study\\text.txt"))) {

            int i; // variable to store each byte that is read

            // Read one byte at a time until end of file (-1 means "no more data")
            while ((i = input.read()) != -1) {
                // Convert the byte to a character and print it to the console
                System.out.print((char) i);
            }

        } catch (IOException e) {
            // If an error happens (e.g. file not found), print an error message
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
