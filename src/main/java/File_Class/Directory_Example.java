package File_Class;

import java.io.File;

public class Directory_Example {
	public static void main(String[] args) {
		// Create single directory
		File dir = new File("D:\\myDir");
		if (dir.mkdir()) {
			System.out.println("Directory created: " + dir.getName());
		} else {
			System.out.println("Failed to create directory.");
		}

		// Create nested directories
		File nestedDir = new File("D:\\myDir\\parentDir\\childDir");
		if (nestedDir.mkdirs()) {
			System.out.println("Nested directories created: " + nestedDir.getPath());
		}

		// List contents of a directory
		String[] files = dir.list();
		if (files != null) {
			System.out.println("Contents of myDir:");
			for (String f : files) {
				System.out.println(f);
			}
		} else {
			System.out.println("Directory is empty or does not exist.");
		}

		// Delete directory
		if (dir.delete()) {
			System.out.println("Directory deleted successfully.");
		} else {
			System.out.println("Failed to delete directory.");
		}
	}
}
