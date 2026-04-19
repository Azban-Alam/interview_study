package Alerts_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Press OK
		driver.switchTo().alert().accept();
		
		// Press Cancel
		driver.switchTo().alert().dismiss();
		
		// Get The Information of pop-up message
		driver.switchTo().alert().getText();
		
		// Enter text on input text box
		driver.switchTo().alert().sendKeys("Hi");

	}

}
