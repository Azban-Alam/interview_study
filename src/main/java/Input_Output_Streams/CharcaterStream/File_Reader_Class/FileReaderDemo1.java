package Input_Output_Streams.CharcaterStream.File_Reader_Class;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo1 {
	public static void main(String args[]) throws IOException {

		File file = new File("Hello1.txt");

		file.createNewFile(); // creates the file
		FileWriter writer = new FileWriter(file); // creates a FileWriter Object
		writer.write("This\n is\n an\n example\n"); // Writes the content to the file
		writer.flush();
		writer.close();

		// Creates a FileReader Object
		FileReader fr = new FileReader(file);
		char[] a = new char[50];
		fr.read(a);

		// reads the content to the array
		for (char c : a) {
			System.out.print(c);
		}
		
		fr.close();
	}
}