package Input_Output_Streams.ByteStream.Others;

import java.io.*;

public class Byte_Stream_copy_data_from_file1_to_file2 {
	public static void main(String[] args) throws IOException {

		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try {
			sourceStream = new FileInputStream("sourcefile.txt");
			targetStream = new FileOutputStream("targetfile.txt");

			// Reading source file and writing content to target file byte by byte
			int temp;
			while ((temp = sourceStream.read()) != -1)
				targetStream.write((byte) temp);
		} finally {
			if (sourceStream != null)
				sourceStream.close();
			if (targetStream != null)
				targetStream.close();
		}
	}
}