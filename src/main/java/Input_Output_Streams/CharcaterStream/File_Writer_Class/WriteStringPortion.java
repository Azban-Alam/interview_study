package Input_Output_Streams.CharcaterStream.File_Writer_Class;

import java.io.FileWriter;
import java.io.IOException;

public class WriteStringPortion {
	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("stringPortion.txt")) {

			String text = "Hello Java FileWriter!";
			fw.write(text, 6, 4); // Writes "Java"
			System.out.println("String portion written successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 * Writes a portion of a string starting from offset and up to len characters.
 * Note: This is handy when you want to write only part of a string instead of
 * the whole thing.
 */