package File_Class;

import java.io.File;

public class RemainingFileMethods {
    public static void main(String[] args) {
        File file = new File("demoFile.txt");

        System.out.println("Parent path: " + file.getParent());
        System.out.println("Parent File: " + file.getParentFile());
        System.out.println("Last modified: " + file.lastModified());

        File renamedFile = new File("renamedFile.txt");
        if (file.renameTo(renamedFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }

        System.out.println("File URI: " + renamedFile.toURI());
        System.out.println("File Path (NIO): " + renamedFile.toPath());
    }
}
