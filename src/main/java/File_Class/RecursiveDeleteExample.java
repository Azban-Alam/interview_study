package File_Class;
import java.io.File;

public class RecursiveDeleteExample {
    public static void main(String[] args) {
        File dir = new File("myDir");
        deleteDirectory(dir);
    }

    // Method to delete directory and its contents
    public static void deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files) {
                    deleteDirectory(f); // recursive call
                }
            }
        }
        if (dir.delete()) {
            System.out.println("Deleted: " + dir.getPath());
        } else {
            System.out.println("Failed to delete: " + dir.getPath());
        }
    }
}
