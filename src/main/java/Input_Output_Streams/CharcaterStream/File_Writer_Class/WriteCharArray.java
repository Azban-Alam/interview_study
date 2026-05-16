package Input_Output_Streams.CharcaterStream.File_Writer_Class;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharArray {
	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("charArray.txt")) {
			
			char[] data = { 'J', 'A', 'V', 'A', ' ', 'I', 'O' };
			fw.write(data, 0, 4); // Writes "JAVA"
			System.out.println("Character array portion written successfully!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// Tip: offset is the starting index, and len is how many characters to write.