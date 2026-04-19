package FileUpload_RobotClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobot {

	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		try {

			// Maximize the browser window
			driver.manage().window().maximize();

			// Navigate to the specified URL
			driver.get("https://demoqa.com/upload-download");

			// Find the "Choose File" button element on the webpage
			WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadFile']"));

			// Use Actions class to move to the "Choose File" button and click on it
			Actions ac = new Actions(driver);
			ac.click(chooseFile).perform();

			// Initialize the Robot class
			Robot rb = new Robot();

			// Wait for 2 seconds to ensure the file dialog is open
			rb.delay(2000);

			// Copy the file path to the clipboard
			StringSelection ss = new StringSelection(

					"<path of the file to be uploaded>");

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			rb.delay(1000);

			// Simulate pressing CTRL + V to paste the copied file path
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			// Simulate pressing ENTER to confirm the file selections
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(2000);

			List<WebElement> uploadedPath = driver.findElements(By.cssSelector("p#uploadedFilePath"));

			if (uploadedPath.size() > 0) {

				System.out.println("File Uploaded successfully");

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			driver.quit();

		}

	}

}