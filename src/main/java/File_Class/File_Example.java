package File_Class;

import java.io.File;
import java.io.IOException;

public class File_Example {
	public static void main(String[] args) {
		try {
			File file = new File("demoFile.txt");

			// Create new file
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}

			// Check permissions
			System.out.println("Can read? " + file.canRead());
			System.out.println("Can write? " + file.canWrite());

			// File details
			System.out.println("File name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("File size (bytes): " + file.length());
			
			boolean b = file.exists();
			System.out.println("File Exists :"+b);

			// Delete file
			if (file.delete()) {
				System.out.println("File deleted successfully.");
			} else {
				System.out.println("Failed to delete file.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
