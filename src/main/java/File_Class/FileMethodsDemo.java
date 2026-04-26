package File_Class;
import java.io.File;
import java.io.IOException;

public class FileMethodsDemo {
    public static void main(String[] args) {
        try {
            // Create a File object
            File file = new File("demoFile.txt");

            // 1. createNewFile()
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. canRead()
            System.out.println("Can read? " + file.canRead());

            // 3. canWrite()
            System.out.println("Can write? " + file.canWrite());

            // 4. exists()
            System.out.println("File exists? " + file.exists());

            // 5. getName()
            System.out.println("File name: " + file.getName());

            // 6. getPath()
            System.out.println("File path: " + file.getPath());

            // 7. getAbsolutePath()
            System.out.println("Absolute path: " + file.getAbsolutePath());

            // 8. isFile()
            System.out.println("Is it a file? " + file.isFile());

            // 9. isDirectory()
            System.out.println("Is it a directory? " + file.isDirectory());

            // 10. length()
            System.out.println("File size (bytes): " + file.length());

            // 11. mkdir()
            File dir = new File("myDir");
            if (dir.mkdir()) {
                System.out.println("Directory created: " + dir.getName());
            }

            // 12. mkdirs()
            File nestedDir = new File("parentDir/childDir");
            if (nestedDir.mkdirs()) {
                System.out.println("Nested directories created: " + nestedDir.getPath());
            }

            // 13. list()
            String[] files = dir.list();
            if (files != null) {
                System.out.println("Files inside myDir:");
                for (String f : files) {
                    System.out.println(f);
                }
            }

            // 14. delete()
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
