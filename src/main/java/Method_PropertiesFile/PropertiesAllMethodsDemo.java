package Method_PropertiesFile;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class PropertiesAllMethodsDemo {
    public static void main(String[] args) {
        
    	Properties props = new Properties();

        // 1. setProperty(String key, String value)
        props.setProperty("username", "admin");
        props.setProperty("password", "12345");
        props.setProperty("os", "Windows");

        // 2. getProperty(String key)
        System.out.println("Username: " + props.getProperty("username"));

        // 3. getProperty(String key, String defaultValue)
        System.out.println("Role: " + props.getProperty("role", "guest"));

        // 4. list(PrintStream out)
        System.out.println("\nListing with PrintStream:");
        props.list(System.out);

        // 5. list(PrintWriter out)
        System.out.println("\nListing with PrintWriter:");
        props.list(new PrintWriter(System.out, true));

        // 6. store(OutputStream out, String comments)
        try (FileOutputStream fos = new FileOutputStream("config.properties")) {
            props.store(fos, "Stored with OutputStream");
        } catch (IOException e) { e.printStackTrace(); }

        // 7. store(Writer writer, String comments)
        try (FileWriter fw = new FileWriter("config_writer.properties")) {
            props.store(fw, "Stored with Writer");
        } catch (IOException e) { e.printStackTrace(); }

        // 8. storeToXML(OutputStream os, String comment)
        try (FileOutputStream fos = new FileOutputStream("config.xml")) {
            props.storeToXML(fos, "Stored to XML");
        } catch (IOException e) { e.printStackTrace(); }

        // 9. storeToXML(OutputStream os, String comment, String encoding)
        try (FileOutputStream fos = new FileOutputStream("config_utf8.xml")) {
            props.storeToXML(fos, "Stored to XML with UTF-8", "UTF-8");
        } catch (IOException e) { e.printStackTrace(); }

        // 10. storeToXML(OutputStream os, String comment, Charset charset)
        try (FileOutputStream fos = new FileOutputStream("config_charset.xml")) {
            props.storeToXML(fos, "Stored to XML with Charset", StandardCharsets.UTF_8);
        } catch (IOException e) { e.printStackTrace(); }

        // 11. load(InputStream inStream)
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            Properties loadedProps = new Properties();
            loadedProps.load(fis);
            System.out.println("\nLoaded from InputStream:");
            loadedProps.list(System.out);
        } catch (IOException e) { e.printStackTrace(); }

        // 12. load(Reader reader)
        try (FileReader fr = new FileReader("config_writer.properties")) {
            Properties loadedProps = new Properties();
            loadedProps.load(fr);
            System.out.println("\nLoaded from Reader:");
            loadedProps.list(System.out);
        } catch (IOException e) { e.printStackTrace(); }

        // 13. loadFromXML(InputStream in)
        try (FileInputStream fis = new FileInputStream("config.xml")) {
            Properties loadedProps = new Properties();
            loadedProps.loadFromXML(fis);
            System.out.println("\nLoaded from XML:");
            loadedProps.list(System.out);
        } catch (IOException e) { e.printStackTrace(); }

        // 14. propertyNames()
        System.out.println("\nProperty Names (Enumeration):");
        Enumeration<?> names = props.propertyNames();
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());
            
            Object nextElement = names.nextElement();
        }

        // 15. stringPropertyNames()
        System.out.println("\nString Property Names (Set):");
        Set<String> keys = props.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + " = " + props.getProperty(key));
        }
    }
}
