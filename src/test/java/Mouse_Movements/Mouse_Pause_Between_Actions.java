package Mouse_Movements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Pause_Between_Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebElement clickable = driver.findElement(By.id("clickable"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(clickable);
		a1.pause(Duration.ofSeconds(2)); // Cause Pause Between the Actions
		a1.build();
		a1.perform();

	}

}
