package Window_Handles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowSwitchExample {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Store the parent window handle
        String parentWindow = driver.getWindowHandle();

        // Open a new window (or click a link that opens a child window)
        driver.findElement(By.id("newWindowButton")).click();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to the child window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to child window: " + driver.getTitle());
                break;
            }
        }

        // Perform actions in child window
        driver.findElement(By.id("childWindowElement")).click();

        // Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Switched back to parent window: " + driver.getTitle());

        // Close all windows
        driver.quit();
    }
}