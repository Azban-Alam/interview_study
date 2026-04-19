package Browser_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();

		String wHandle = driver.getWindowHandle();
		
		System.out.println("Window_Handle :" + wHandle);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
