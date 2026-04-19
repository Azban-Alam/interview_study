package Hidden_Element_Click;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClickHiddenElement {

    public static void main(String[] args) {

        // Set up ChromeDriver path (could be replaced with WebDriverManager for better flexibility)
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        try {
            // Step 1: Navigate to the target website
            driver.get("https://www.letskodeit.com/practice");

            // Step 2: Implicit wait to ensure elements load within 5 seconds
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Step 3: Locate the hidden element using its ID
            WebElement hiddenElement = driver.findElement(By.id("displayed-text"));

            // Step 4: Use JavaScriptExecutor to click on the hidden element
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", hiddenElement);

            // Confirmation message
            System.out.println("Hidden element clicked successfully!");

        } catch (Exception e) {
            // Handle any exceptions that occur during execution
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            // Step 5: Close the browser after execution
            driver.quit();
        }
    }
}