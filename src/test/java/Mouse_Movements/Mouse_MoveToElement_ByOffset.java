package Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_MoveToElement_ByOffset {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebElement tracker = driver.findElement(By.id("mouse-tracker"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(tracker, 8, 0);
		a2.build();
		a2.perform();
	}

}
