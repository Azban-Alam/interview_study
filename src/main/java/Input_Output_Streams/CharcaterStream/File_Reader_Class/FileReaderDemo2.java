package Input_Output_Streams.CharcaterStream.File_Reader_Class;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) {

		String fileName = "example.txt"; // File to be read

		try (FileReader fileReader = new FileReader(fileName)) {
			
			int character;
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character); // Print each character
			}
			
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
	}
}