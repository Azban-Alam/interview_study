package Input_Output_Streams.ByteStream.BFIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		try {
			// Create a FileInputStream to read the file
			FileInputStream fileInputStream = new FileInputStream("example.txt");

			// Wrap the FileInputStream in a BufferedInputStream
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			
			byte[] buffer = new byte[1024]; // 1 KB buffer
			
			int bytesRead;
			
			// Read the data in chunks and print each chunk
			while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
				System.out.write(buffer, 0, bytesRead); // Write the chunk to output
			}
			// Close the stream
			bufferedInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}