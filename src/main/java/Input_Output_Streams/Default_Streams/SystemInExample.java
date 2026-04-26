package Input_Output_Streams.Default_Streams;
import java.io.IOException;

public class SystemInExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");

        // Reads a single byte from System.in
        int data = System.in.read();  

        // Print the character and its ASCII value
        System.out.println("You entered: " + (char) data);
        System.out.println("ASCII Value: " + data);
    }
}