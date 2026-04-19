package Browser_Methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();

		Set<String> wHandle = driver.getWindowHandles();
		
		for (String vHandle : wHandle) {
			System.out.println(vHandle);
		}

		Thread.sleep(5000);
		driver.quit();

	}

}

/*

//Initialize WebDriver
WebDriver driver = new ChromeDriver();
driver.get("https://example.com");

//Open a new window (for demonstration purposes)
((JavascriptExecutor) driver).executeScript("window.open('https://anotherexample.com', '_blank');");

//Get all window handles
Set<String> windowHandles = driver.getWindowHandles();

//Iterate and switch between windows
for (String handle : windowHandles) {
 driver.switchTo().window(handle);
 System.out.println("Switched to window: " + driver.getTitle());
}

//Close browser
driver.quit();

*/