package Input_Output_Streams.CharcaterStream.File_Writer_Class;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleChar {
	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("singleChar.txt")) {

			fw.write(65); // Writes 'A' (ASCII value of 65)
			System.out.println("Single character written successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
