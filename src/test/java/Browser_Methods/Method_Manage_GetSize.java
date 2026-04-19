package Browser_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Manage_GetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		Thread.sleep(5000);

		Dimension d = driver.manage().window().getSize();
		
		int height = d.getHeight();
		int width = d.getWidth();
		
		System.out.println("Window Height :" + d.getHeight());
		System.out.println("Window Width :" + d.getWidth());

		driver.close();
	}
}
